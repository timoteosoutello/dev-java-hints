package com.github;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class ConcurrencyCompleatableExecution {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// OK
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
			return "Test Passed";
		}).completeOnTimeout("Error", 1, TimeUnit.SECONDS);
		System.out.println(future.get());

		// With Error
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Test Passed";
		}).completeOnTimeout("Error", 1, TimeUnit.SECONDS);
		System.out.println(future2.get());
	}
}
