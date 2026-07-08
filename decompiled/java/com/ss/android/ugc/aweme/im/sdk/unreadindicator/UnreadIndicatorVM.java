package com.ss.android.ugc.aweme.im.sdk.unreadindicator;

import X.C1954807lC;
import X.C910570Znr;
import X.C910590Znt;
import X.EnumC910600Znu;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public abstract class UnreadIndicatorVM extends AssemViewModel<C910570Znr> {
    public String LL;
    public final Map<EnumC910600Znu, UnreadHandler> LLILLJJLI = new LinkedHashMap();

    public abstract void xQ2(int i, long j);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* JADX INFO: renamed from: vQ2, reason: merged with bridge method [inline-methods] */
    public C910570Znr defaultState() {
        return new C910570Znr(0);
    }

    public final UnreadHandler wQ2(EnumC910600Znu enumC910600Znu) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLILLJJLI;
        Object unreadMessageHandler = linkedHashMap.get(enumC910600Znu);
        if (unreadMessageHandler == null) {
            UnreadHandler.LJJIIJZLJL.getClass();
            int i = C910590Znt.LIZ[enumC910600Znu.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            unreadMessageHandler = new UnreadGroupOwnerMsgHandler();
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        unreadMessageHandler = new UnreadMentionMsgHandler();
                    }
                } else {
                    unreadMessageHandler = new UnreadReactionHandler();
                }
            } else {
                unreadMessageHandler = new UnreadMessageHandler();
            }
            linkedHashMap.put(enumC910600Znu, unreadMessageHandler);
        }
        return (UnreadHandler) unreadMessageHandler;
    }
}
