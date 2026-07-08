package com.ss.android.ugc.aweme.pns.usercommunication.api;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class NetworkUserCommunicationChannelModel implements Serializable {

    @C09CT("action_list")
    public final List<UserCommunicationProcessorModel> processorList;

    public NetworkUserCommunicationChannelModel() {
        this(null);
    }

    public NetworkUserCommunicationChannelModel(List<UserCommunicationProcessorModel> list) {
        this.processorList = list;
    }
}
