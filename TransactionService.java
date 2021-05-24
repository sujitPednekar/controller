package com.finance.layer4;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.finance.layer2.TransactionTable;

@Service
public interface TransactionService {
	void addTransactionService(TransactionTable tRef);
	TransactionTable findTransactionService(int transno);  
	Set<TransactionTable> findAllTransactionsService();   
	void modifyTransactionService(TransactionTable tRef); 
	void removeTransactionService(int transno); 
	Set<TransactionTable> findTransactionsByOrderService(int ordId);

}
