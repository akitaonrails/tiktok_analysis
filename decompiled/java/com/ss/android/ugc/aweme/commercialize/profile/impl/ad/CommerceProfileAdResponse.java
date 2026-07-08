package com.ss.android.ugc.aweme.commercialize.profile.impl.ad;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import X.InterfaceC593520NPq;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class CommerceProfileAdResponse extends BaseResponse {

    @C09CT("aweme_list")
    public final List<Aweme> awemeList;

    @C09CT("no_ad_reason")
    public final NoAdReason noAdReason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NoAdReason implements InterfaceC593520NPq<String> {
        public static final /* synthetic */ NoAdReason[] LLILLJJLI;
        public static final /* synthetic */ C2254308sP LLILLL;

        @C09CT("political_account")
        public static final NoAdReason POLITICAL_ACCOUNT;

        @C09CT("shop_account")
        public static final NoAdReason SHOP_ACCOUNT;

        @C09CT("state_controlled_media")
        public static final NoAdReason STATE_CONTROLLED_MEDIA;
        public final String LL;

        public static InterfaceC2044707zh<NoAdReason> getEntries() {
            return LLILLL;
        }

        static {
            NoAdReason noAdReason = new NoAdReason("POLITICAL_ACCOUNT", 0, "political_account");
            POLITICAL_ACCOUNT = noAdReason;
            NoAdReason noAdReason2 = new NoAdReason("STATE_CONTROLLED_MEDIA", 1, "state_controlled_media");
            STATE_CONTROLLED_MEDIA = noAdReason2;
            NoAdReason noAdReason3 = new NoAdReason("SHOP_ACCOUNT", 2, "shop_account");
            SHOP_ACCOUNT = noAdReason3;
            NoAdReason[] noAdReasonArr = {noAdReason, noAdReason2, noAdReason3};
            LLILLJJLI = noAdReasonArr;
            LLILLL = new C2254308sP(noAdReasonArr);
        }

        public static NoAdReason[] values() {
            return (NoAdReason[]) LLILLJJLI.clone();
        }

        @Override // X.InterfaceC593520NPq
        public String getParamValue() {
            return this.LL;
        }

        public static NoAdReason valueOf(String str) {
            return (NoAdReason) C08FF.LIZ(NoAdReason.class, str);
        }

        public NoAdReason(String str, int i, String str2) {
            this.LL = str2;
        }
    }
}
