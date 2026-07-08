package com.ss.android.ugc.aweme.internalshare.impl.refactor.assem;

import X.C01GW;
import X.C0I10;
import X.C0I1I;
import X.C0I1K;
import X.C0I1M;
import X.C0I7E;
import X.C0WZX;
import X.C13BV;
import X.C13LQ;
import X.C2204961BRm;
import X.C452501pT;
import android.content.Context;
import android.text.Editable;
import android.text.style.CharacterStyle;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class MentionEditDelegate implements IShareMentionEditAbility {
    public final C0I7E LL;
    public final ShareContactListViewModel LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 436));

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.IShareMentionEditAbility
    public final List<RichTextInfo> Qg1() throws Throwable {
        List<C0I1K> listLJJLL;
        Editable editableLLZLLLL = C2204961BRm.LLZLLLL(this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameeeqwtSByH8R1mZSA2maOLSyns0fjRIASfyJejEtOiVigs", null));
        if (editableLLZLLLL == null) {
            return null;
        }
        Object[] spans = editableLLZLLLL.getSpans(0, editableLLZLLLL.length(), C0I1K.class);
        if (spans == null || (listLJJLL = C13LQ.LJJLL(spans)) == null) {
            listLJJLL = C13BV.INSTANCE;
        }
        if (listLJJLL.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C0I1K c0i1k : listLJJLL) {
            String str = c0i1k.LIZIZ;
            if (str != null) {
                int spanStart = editableLLZLLLL.getSpanStart(c0i1k);
                int spanEnd = editableLLZLLLL.getSpanEnd(c0i1k);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    arrayList.add(new RichTextInfo(spanStart, spanEnd - spanStart, Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT) ? C0I1M.MENTION_ALL.getValue() : C0I1M.MENTION_SINGLE.getValue(), str, null, 0));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.IShareMentionEditAbility
    public final void ZO0() throws Throwable {
        C0I1K[] c0i1kArr;
        CharacterStyle[] characterStyleArr;
        Editable editableLLZLLLL = C2204961BRm.LLZLLLL(this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameeeqwtSByH8R1mZSA2maOLSyns0fjRIASfyJejEtOiVigs", null));
        if (editableLLZLLLL == null || (c0i1kArr = (C0I1K[]) editableLLZLLLL.getSpans(0, editableLLZLLLL.length(), C0I1K.class)) == null) {
            return;
        }
        for (C0I1K c0i1k : c0i1kArr) {
            int spanStart = editableLLZLLLL.getSpanStart(c0i1k);
            int spanEnd = editableLLZLLLL.getSpanEnd(c0i1k);
            editableLLZLLLL.removeSpan(c0i1k);
            if (spanStart >= 0 && spanEnd > spanStart && (characterStyleArr = (CharacterStyle[]) editableLLZLLLL.getSpans(spanStart, spanEnd, CharacterStyle.class)) != null) {
                for (CharacterStyle characterStyle : characterStyleArr) {
                    editableLLZLLLL.removeSpan(characterStyle);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.IShareMentionEditAbility
    public final C0I10 xn() throws Throwable {
        Editable editableLLZLLLL = C2204961BRm.LLZLLLL(this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameeeqwtSByH8R1mZSA2maOLSyns0fjRIASfyJejEtOiVigs", null));
        if (editableLLZLLLL == null) {
            return null;
        }
        return C0I1I.LIZ(this.LL.getSelectionStart(), editableLLZLLLL);
    }

    public MentionEditDelegate(C0I7E c0i7e, ShareContactListViewModel shareContactListViewModel) {
        this.LL = c0i7e;
        this.LLILLJJLI = shareContactListViewModel;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.IShareMentionEditAbility
    public final void hq(String str, String str2) throws Throwable {
        String str3;
        C0I10 c0i10Xn = xn();
        if (c0i10Xn == null || (str3 = c0i10Xn.LIZ) == null) {
            str3 = "";
        }
        if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            Context context = this.LL.getContext();
            if (context != null) {
                str2 = context.getString(2131831600);
            } else {
                return;
            }
        }
        if (str2 != null) {
            this.LL.LJIIIIZZ(str2, Integer.valueOf(R.attr.ba), str, str3);
        }
    }
}
