package com.finance.layer4;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.layer2.TransactionTable;
import com.finance.layer3.TransactionRepository;
@Service
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	TransactionRepository tranRepo;

	@Override
	public void addTransactionService(TransactionTable tRef) {
		// TODO Auto-generated method stub
		tranRepo.addTransaction(tRef);
		System.out.println("transaction added successfully");

	}

	@Override
	public TransactionTable findTransactionService(int transno) {
		// TODO Auto-generated method stub
		System.out.println("finding transaction.......");
		return tranRepo.findTransaction(transno);
	}

	@Override
	public Set<TransactionTable> findAllTransactionsService() {
		// TODO Auto-generated method stub
		 tranRepo.findAllTransactions();
		return tranRepo.findAllTransactions();
	}

	@Override
	public void modifyTransactionService(TransactionTable tRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTransactionService(int transno) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<TransactionTable> findTransactionsByOrderService(int ordId) {
		// TODO Auto-generated method stub
		return tranRepo.findTransactionsByOrder(ordId);
	}

}
