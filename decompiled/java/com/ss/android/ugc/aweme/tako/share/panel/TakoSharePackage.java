package com.ss.android.ugc.aweme.tako.share.panel;

import X.AnonymousClass0957;
import X.C1370940lmO;
import X.C2097608Jq;
import com.ss.android.ugc.aweme.model.LinkDefaultSharePackageV2;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class TakoSharePackage extends LinkDefaultSharePackageV2 {
    public static final int $stable = 8;
    public Map<String, String> commonParams;
    public volatile boolean isAIGCContent;
    public volatile boolean isVideoMedia;
    public volatile String localTaggedMediaPath;
    public volatile String mediaShareId;
    public volatile String mediaSourceUrl;
    public String mobMessageId;
    public String screenType;
    public volatile AnonymousClass0957<String> taggedMediaDeferred;
    public volatile String videoFileHash;

    public TakoSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
        this.commonParams = C2097608Jq.LJ();
        this.mobMessageId = "";
        this.screenType = "full_screen";
    }
}
