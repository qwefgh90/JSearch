package com.d2.osfad.executor;

import java.util.List;

import com.d2.osfad.exception.AlreadyRunThreadsException;
import com.d2.osfad.main.ICallBack;

public class ExternalExcutor implements IExternalExecutor{
	
	InternalExcutor internalExcutor = null;
	public ExternalExcutor() {
		super();
		internalExcutor = InternalExcutor.getSingleInstance();
	}

	@Override
	public void findKeywordFromOneDirectory(String path, String query,
			ICallBack callback) throws AlreadyRunThreadsException {
		internalExcutor.internalFindKeywordFromOneDirectory(path, query, callback);
		
	}

	@Override
	public void findKeywordFromRecursiveDirectories(String path, String query,
			ICallBack callback) throws AlreadyRunThreadsException {
		// TODO Auto-generated method stub
		internalExcutor.internalFindKeywordFromRecursiveDirectories(path, query, callback);
		
	}

	@Override
	public void findKeywordfromOneDocument(String filePath, String query,
			ICallBack callback) throws AlreadyRunThreadsException {
		// TODO Auto-generated method stub
		internalExcutor.internalFindKeywordfromOneDocument(filePath, query, callback);
		
	}

	@Override
	public void findKeywordfromPathList(List<String> pathList, String query,
			ICallBack callback) throws AlreadyRunThreadsException {
		// TODO Auto-generated method stub
		internalExcutor.internalFindKeywordfromPathList(pathList, query, callback);
		
	}

	@Override
	public void shutdownExecutor() {
		// TODO Auto-generated method stub
		internalExcutor.internalShutdownExecutor();
	}

	@Override
	public void stopJobThread() {
		// TODO Auto-generated method stub
		internalExcutor.internalStopJobThread();
	}

	@Override
	public void clearJobQueue() {
		// TODO Auto-generated method stub
		internalExcutor.internalClearJobQueue();
	}

	@Override
	public void clearArgumentsHashMap() {
		// TODO Auto-generated method stub
		internalExcutor.internalClearArgumentsHashMap();
	}

}
