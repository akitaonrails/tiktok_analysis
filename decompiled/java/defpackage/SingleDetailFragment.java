package defpackage;

import X.C890330YwJ;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.fragment.ChatDetailFragment;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC836760Ws6
public final class SingleDetailFragment extends ChatDetailFragment {
    public static final String _pnsPageId = "GywiLiM2DCA4KCHELIOSY/DjctLiI2JjE=";

    public static final class a {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.fragment.ChatDetailFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJJIJ(this, new AwS546S0100000_2(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.fragment.ChatDetailFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            r18 = this;
            r0 = 2131100553(0x7f060389, float:1.781349E38)
            int r0 = X.C1383370m6R.LJFF(r0)
            r2 = r19
            r2.setBackgroundColor(r0)
            r7 = r18
            android.os.Bundle r3 = r7.getArguments()
            r1 = 0
            if (r3 == 0) goto Lae
            java.lang.String r0 = "key_user"
            java.io.Serializable r8 = r3.getSerializable(r0)
        L1b:
            boolean r0 = r8 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMUser
            if (r0 == 0) goto Lab
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r8 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r8
        L21:
            android.os.Bundle r4 = r7.getArguments()
            r3 = 0
            if (r4 == 0) goto La9
            java.lang.String r0 = "is_stranger"
            boolean r9 = r4.getBoolean(r0, r3)
        L2e:
            android.os.Bundle r4 = r7.getArguments()
            if (r4 == 0) goto La7
            java.lang.String r0 = "is_author_supporter"
            boolean r10 = r4.getBoolean(r0, r3)
        L3a:
            kotlin.jvm.internal.AwS546S0100000_2 r4 = new kotlin.jvm.internal.AwS546S0100000_2
            r0 = 1
            r4.<init>(r8, r0)
            X.01GW r0 = X.C1509305vX.LIZ(r4)
            if (r8 == 0) goto L96
            java.lang.Object r11 = r0.getValue()
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L50
            java.lang.String r11 = ""
        L50:
            X.04TC r0 = com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data.IChatDetailApi.LIZ
            r0.getClass()
            X.01GW<com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data.IChatDetailApi> r0 = X.C04TC.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data.IChatDetailApi r0 = (com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data.IChatDetailApi) r0
            if (r0 == 0) goto La4
            X.12Dl r17 = r0.LIZIZ()
        L63:
            X.0Xz1 r14 = X.C0YNP.LIZIZ(r11)
            X.0Y8T r15 = r14.LJ()
            r4 = 1
            if (r15 == 0) goto L9f
            boolean r0 = X.C882340YjQ.LJ(r15)
            if (r0 != r4) goto L9f
            r13 = 1
        L75:
            long r5 = r15.getConversationShortId()
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
        L7d:
            X.06QI r0 = com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature.LIZ
            com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature r0 = r0.LIZ()
            if (r0 == 0) goto L9c
            boolean r0 = r0.LIZLLL()
            if (r0 != r4) goto L9c
            r16 = 1
        L8d:
            u8 r6 = new u8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = 3
            X.C723850SaN.LIZ(r7, r3, r1, r6, r0)
        L96:
            java.lang.String r0 = "chat_settings"
            X.C1848530yCh.LIZLLL(r2, r0, r1)
            return
        L9c:
            r16 = 0
            goto L8d
        L9f:
            r13 = 0
            if (r15 != 0) goto L75
            r12 = r1
            goto L7d
        La4:
            r17 = r1
            goto L63
        La7:
            r10 = 0
            goto L3a
        La9:
            r9 = 0
            goto L2e
        Lab:
            r8 = r1
            goto L21
        Lae:
            r8 = r1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SingleDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
