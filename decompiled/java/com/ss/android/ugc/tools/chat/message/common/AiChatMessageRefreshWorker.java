package com.ss.android.ugc.tools.chat.message.common;

import X.C01GW;
import X.C06Z6;
import X.C0Z2Z;
import X.C1758306ub;
import X.C1762006vC;
import X.C452501pT;
import X.C869590Y9l;
import X.EnumC1762106vD;
import X.EnumC21290318Tl;
import X.InterfaceC1364105Vn;
import X.InterfaceC904740ZeS;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetBotCardTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.service.refresh.IMessageRefreshManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class AiChatMessageRefreshWorker implements IMessageEventProtocol {
    public final String LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(338));
    public final C06Z6 LLILLL = C06Z6.IO;

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final C06Z6 mh1() {
        return this.LLILLL;
    }

    public AiChatMessageRefreshWorker(String str) {
        this.LL = str;
    }

    public static boolean LIZ(C869590Y9l c869590Y9l) {
        VisualPoetBotCardTemplate visualPoetBotCardTemplate;
        if (c869590Y9l.getMsgType() != 1820) {
            return true;
        }
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (!(baseTemplateLIZ instanceof VisualPoetBotCardTemplate) || (visualPoetBotCardTemplate = (VisualPoetBotCardTemplate) baseTemplateLIZ) == null || visualPoetBotCardTemplate.botPictureComponent.taskStatusComponent == EnumC21290318Tl.RUNNING) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
        List<C869590Y9l> list;
        ArrayList arrayList;
        if (interfaceC904740ZeS instanceof C1758306ub) {
            List<C869590Y9l> list2 = ((C1758306ub) interfaceC904740ZeS).LIZ;
            arrayList = new ArrayList();
            for (C869590Y9l c869590Y9l : list2) {
                if (LIZ(c869590Y9l)) {
                    arrayList.add(c869590Y9l);
                }
            }
        } else if (interfaceC904740ZeS instanceof C1762006vC) {
            if (((C1762006vC) interfaceC904740ZeS).LIZIZ != EnumC1762106vD.SUCCESS) {
                interfaceC904740ZeS = null;
            }
            C1762006vC c1762006vC = (C1762006vC) interfaceC904740ZeS;
            if (c1762006vC != null && (list = c1762006vC.LIZ) != null) {
                arrayList = new ArrayList();
                for (C869590Y9l c869590Y9l2 : list) {
                    if (LIZ(c869590Y9l2)) {
                        arrayList.add(c869590Y9l2);
                    }
                }
            } else {
                return;
            }
        } else {
            return;
        }
        IMessageRefreshManager iMessageRefreshManager = (IMessageRefreshManager) this.LLILLJJLI.getValue();
        if (iMessageRefreshManager != null) {
            iMessageRefreshManager.LIZJ(this.LL, arrayList);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final Object NX1(InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }
}
