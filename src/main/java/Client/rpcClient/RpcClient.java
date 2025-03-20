package Client.rpcClient;

import common.Message.RpcRequest;
import common.Message.RpcResponse;

/**
 * @author wxx
 * @version 1.0
 * @create 2024/5/2 18:55
 */
public interface   RpcClient {

    //定义底层通信的方法
    RpcResponse sendRequest(RpcRequest request);
}
