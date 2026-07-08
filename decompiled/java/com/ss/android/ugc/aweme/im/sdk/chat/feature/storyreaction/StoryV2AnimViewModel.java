package com.ss.android.ugc.aweme.im.sdk.chat.feature.storyreaction;

import X.C01GW;
import X.C0ZDX;
import X.C231400uu;
import X.C291001Au;
import X.C452501pT;
import X.C461060I6e;
import X.C869590Y9l;
import X.EnumC452301pR;
import X.InterfaceC0148002o;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IStoryV2AnimViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StoryV2AnimViewModel extends IStoryV2AnimViewModel {
    public Long LL;
    public final C01GW LLILLJJLI = C452501pT.LIZ(EnumC452301pR.NONE, AFwS192S0000000_6.get$arr$(82));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C231400uu(null);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IStoryV2AnimViewModel
    public final void vQ2() {
        C291001Au<String> c291001Au = getState().LL;
        if (c291001Au != null) {
            c291001Au.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IStoryV2AnimViewModel
    public final void wQ2(List<? extends C869590Y9l> list) {
        C869590Y9l next;
        Iterator<? extends C869590Y9l> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C869590Y9l c869590Y9l = next;
                if (!C0ZDX.LJJJJIZL(c869590Y9l) && C461060I6e.LIZIZ(c869590Y9l)) {
                    long jLongValue = -1;
                    if (this.LL == null) {
                        this.LL = Long.valueOf(((Keva) this.LLILLJJLI.getValue()).getLong(c869590Y9l.getConversationId(), -1L));
                    }
                    long index = c869590Y9l.getIndex();
                    Long l = this.LL;
                    if (l != null) {
                        jLongValue = l.longValue();
                    }
                    if (index >= jLongValue) {
                        String conversationId = c869590Y9l.getConversationId();
                        long index2 = c869590Y9l.getIndex();
                        this.LL = Long.valueOf(index2);
                        ((Keva) this.LLILLJJLI.getValue()).storeLong(conversationId, index2);
                        if (!Intrinsics.LJFF(c869590Y9l.getLocalExt().get("reaction_anim"), "1")) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        C869590Y9l c869590Y9l2 = next;
        if (c869590Y9l2 == null) {
            return;
        }
        setState(new AwS585S0100000_6(c869590Y9l2, 94));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IStoryV2AnimViewModel
    public final boolean xQ2(String str) {
        C291001Au<String> c291001Au = getState().LL;
        if (c291001Au != null && !c291001Au.LIZIZ && Intrinsics.LJFF(str, c291001Au.LIZ)) {
            C291001Au<String> c291001Au2 = getState().LL;
            return true;
        }
        return false;
    }
}
