package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C01GW;
import X.C452501pT;
import java.util.Set;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class SSCImportantChannelsSettings {
    public static final SSCImportantChannelsSettings INSTANCE = new SSCImportantChannelsSettings();
    public static final String[] DEFAULT = new String[0];
    public static final C01GW channelSet$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(772));

    public final Set<String> getChannelSet() {
        return (Set) channelSet$delegate.getValue();
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
