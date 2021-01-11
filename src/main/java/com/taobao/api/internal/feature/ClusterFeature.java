package com.taobao.api.internal.feature;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.internal.cluster.ClusterManager;
import com.taobao.api.internal.util.WebUtils;

/**
 * ��ض���Զ����伯Ⱥ�ͻ�������
 */
public abstract class ClusterFeature {

    static {
        WebUtils.setIgnoreHostCheck(true);
    }

    public void init(final DefaultTaobaoClient client) {
        ClusterManager.initRefreshThread(client);
    }
}