package defpackage;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoBnplJsbRegisterConfig {

    @C09CT("bid_white_list")
    public final List<String> bidWhiteList;

    @C09CT("full_open")
    public final boolean fullOpen;

    public PipoBnplJsbRegisterConfig() {
        this(false, null);
    }

    public PipoBnplJsbRegisterConfig(boolean z, List<String> list) {
        this.fullOpen = z;
        this.bidWhiteList = list;
    }
}
