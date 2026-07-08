package com.bytedance.lynx.hybrid.extension.kyc;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes31.dex */
public final class FeatureKycWebExtensionWhitelistModel {

    @C09CT("enable_whitelist")
    public final boolean enable;

    @C09CT("whitelist")
    public final ArrayList<String> whitelist = new ArrayList<>();
}
