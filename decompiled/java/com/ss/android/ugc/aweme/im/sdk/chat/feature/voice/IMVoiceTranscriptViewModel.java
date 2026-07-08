package com.ss.android.ugc.aweme.im.sdk.chat.feature.voice;

import X.C06P6;
import X.C0IC4;
import X.C13BV;
import X.C13LP;
import X.C463090IDz;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class IMVoiceTranscriptViewModel extends AssemViewModel<InterfaceC0148002o> {
    public final ChatroomEventAbility LL;
    public final MessagePowerListAbility LLILLJJLI;
    public Long LLILLL;
    public List<C0IC4> LLILZ = C13BV.INSTANCE;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C463090IDz(9);
    }

    public final void wQ2() {
        Object next;
        List listLLIIII = C13LP.LLIIII(this.LLILZ);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLLIIII) {
            C0IC4 c0ic4 = (C0IC4) obj;
            if (c0ic4.LIZ.isAttachedToWindow() && c0ic4.LIZ.getTop() >= 0) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int top = ((C0IC4) next).LIZ.getTop();
                do {
                    Object next2 = it2.next();
                    int top2 = ((C0IC4) next2).LIZ.getTop();
                    if (top > top2) {
                        next = next2;
                        top = top2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        C0IC4 c0ic42 = (C0IC4) next;
        Long lValueOf = c0ic42 != null ? Long.valueOf(c0ic42.LIZIZ) : null;
        if (Intrinsics.LJFF(lValueOf, this.LLILLL)) {
            return;
        }
        this.LLILLL = lValueOf;
        this.LL.QU0(new C06P6(false));
    }

    public final void vQ2(long j) {
        List<C0IC4> list = this.LLILZ;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<C0IC4> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZIZ == j) {
                List<C0IC4> list2 = this.LLILZ;
                ArrayList arrayList = new ArrayList();
                for (C0IC4 c0ic4 : list2) {
                    if (c0ic4.LIZIZ != j) {
                        arrayList.add(c0ic4);
                    }
                }
                this.LLILZ = arrayList;
                return;
            }
        }
    }

    public IMVoiceTranscriptViewModel(ChatroomEventAbility chatroomEventAbility, MessagePowerListAbility messagePowerListAbility) {
        this.LL = chatroomEventAbility;
        this.LLILLJJLI = messagePowerListAbility;
    }
}
