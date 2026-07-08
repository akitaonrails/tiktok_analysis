package com.ss.android.ugc.aweme.chatdetail.redesign.detailpage;

import X.C01GW;
import X.C04TC;
import X.C0HYH;
import X.C0WZX;
import X.C0Y8T;
import X.C0YNP;
import X.C1383370m6R;
import X.C13IQ;
import X.C1440005kM;
import X.C1509305vX;
import X.C1848530yCh;
import X.C19719912Dl;
import X.C19EG;
import X.C20277814Wa;
import X.C2204961BRm;
import X.C723850SaN;
import X.C893980Z5g;
import X.InterfaceC836760Ws6;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.fragment.ChatDetailFragment;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data.IChatDetailApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS2S1300100_14;

/* JADX INFO: loaded from: classes15.dex */
@InterfaceC836760Ws6
public final class GroupDetailFragment extends ChatDetailFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkKDs3LTEtICN9OiHELIOSAoLDw6LytiLSonKSwgOS40LWsLOyAmOAEpPS46JAM+KCg+LSs4";
    public final C01GW LLIZ = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(54));
    public final C01GW LLIZLLLIL = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(53));
    public final C01GW LLJ = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(55));

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.fragment.ChatDetailFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        long conversationShortId;
        C19719912Dl c19719912DlLIZIZ;
        view.setBackgroundColor(C1383370m6R.LJFF(R.attr.zm));
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("key_conversation_id")) != null) {
            C0Y8T c0y8tLJ = C0YNP.LIZIZ(string).LJ();
            if (c0y8tLJ != null) {
                conversationShortId = c0y8tLJ.getConversationShortId();
            } else {
                conversationShortId = 0;
            }
            IChatDetailApi.LIZ.getClass();
            IChatDetailApi value = C04TC.LIZIZ.getValue();
            if (value != null) {
                c19719912DlLIZIZ = value.LIZIZ();
            } else {
                c19719912DlLIZIZ = null;
            }
            C723850SaN.LIZ(this, false, null, new AwS2S1300100_14(this, (GroupDetailFragment) new C893980Z5g(string), (C893980Z5g) string, (String) conversationShortId, (long) c19719912DlLIZIZ, (C13IQ<? extends UISlotAssem>) 1), 3);
        }
        C1848530yCh.LIZLLL(view, "chat_settings", null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        C19EG activity;
        super.onActivityResult(i, i2, intent);
        if (i == 3333) {
            if (i2 == 4444) {
                C19EG activity2 = getActivity();
                if (activity2 != null) {
                    C2204961BRm.LLJJJ(activity2, 2097, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYovK2SZ1Ov9PAxMHavLl9kHqqqQyXibIdNQBMtb08fuG2blLY82V4q24yeZLbVnK", null));
                    activity2.finish();
                }
                C1440005kM.LIZ(new C0HYH());
                return;
            }
            if (i2 != 7777 || (activity = getActivity()) == null) {
                return;
            }
            activity.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.fragment.ChatDetailFragment, X.InterfaceC21503819Do
    public final void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
        onActivityResult(i, i2, intent);
    }
}
