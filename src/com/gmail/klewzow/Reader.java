package com.gmail.klewzow;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Reader {
	public static ByteBuffer read(File file) {

		try (FileChannel fc = (FileChannel) Files.newByteChannel(file.toPath(), StandardOpenOption.READ)) {
			MappedByteBuffer mb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
			ByteBuffer b = ByteBuffer.allocate((int) fc.size());
			while (mb.limit() - mb.position() != 0) {
				b.put((byte) mb.get());
			}
			b.flip();
			return b;
		} catch (IOException e) {
			System.out.println("class Reader => File not Found");
		}
		return null;
	}

}
