package com.ss.android.ugc.aweme.groupshot.vh;

import X.C01GW;
import X.C0Z2Z;
import X.C0ZOY;
import X.C0ZTJ;
import X.C0ZTM;
import X.C2097608Jq;
import X.C300840Bqk;
import X.C452501pT;
import X.C462420IBk;
import X.C869590Y9l;
import X.C898560ZMw;
import X.C898790ZNt;
import X.C902730ZbD;
import X.C911450ZpH;
import X.C911570ZpT;
import X.InterfaceC1891350zJl;
import X.InterfaceC903660Zci;
import X.InterfaceC904590ZeD;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ext.IInteractiveTaskIndexTracker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.template.card.AIGroupShotCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class AIGroupShotCardProtocol implements IMMessageListProtocol<C462420IBk> {
    public final Fragment LL;
    public final C898790ZNt LLILLJJLI = new C898790ZNt(new int[]{1812});
    public final Class<? extends PowerCell<C462420IBk>> LLILLL = AIGroupShotCardCell.class;
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.AI_GROUP_SHOT_CARD;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 155));

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C462420IBk> getPowerItemClazz() {
        return null;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C462420IBk> toMessageListProtocol() {
        return new C902730ZbD(this);
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC902770ZbH
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC902800ZbK
    public final Class<? extends PowerCell<C462420IBk>> getWithCell() {
        return this.LLILLL;
    }

    public AIGroupShotCardProtocol(Fragment fragment) {
        this.LL = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        if (!C911570ZpT.LIZ().enableGroupShot) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!C0ZTJ.LIZJ((C869590Y9l) obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return list;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC1891350zJl mapToPowerItem(List list, C869590Y9l c869590Y9l, int i) {
        AIGroupShotCardTemplate aIGroupShotCardTemplate;
        String str;
        String str2;
        IInteractiveTaskIndexTracker iInteractiveTaskIndexTracker;
        IInteractiveTaskIndexTracker iInteractiveTaskIndexTracker2;
        Boolean boolValueOf;
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        Long lValueOf = null;
        if (baseTemplateLIZ instanceof AIGroupShotCardTemplate) {
            aIGroupShotCardTemplate = (AIGroupShotCardTemplate) baseTemplateLIZ;
        } else {
            aIGroupShotCardTemplate = null;
        }
        boolean zBooleanValue = false;
        if (C300840Bqk.LIZ()) {
            if (aIGroupShotCardTemplate != null && (iInteractiveTaskIndexTracker2 = (IInteractiveTaskIndexTracker) PluggableExtentionKt.pluggableSpi$default(IInteractiveTaskIndexTracker.class, false, false, false, 14, null)) != null && (boolValueOf = Boolean.valueOf(iInteractiveTaskIndexTracker2.LIZIZ(c869590Y9l, aIGroupShotCardTemplate))) != null && (zBooleanValue = boolValueOf.booleanValue())) {
                c869590Y9l.setPropertyItemListMap(C2097608Jq.LJ());
            }
        } else if (Intrinsics.LJFF(c869590Y9l.getLocalExt().get("local_ext_group_shot_hide_card"), "1") || (aIGroupShotCardTemplate != null && aIGroupShotCardTemplate.hideCard)) {
            zBooleanValue = true;
            c869590Y9l.setPropertyItemListMap(C2097608Jq.LJ());
        }
        C911450ZpH.LIZ.getClass();
        boolean zLIZJ = C911450ZpH.LIZJ(c869590Y9l);
        if (C300840Bqk.LIZ()) {
            if (aIGroupShotCardTemplate != null && (str2 = aIGroupShotCardTemplate.taskId) != null && (iInteractiveTaskIndexTracker = (IInteractiveTaskIndexTracker) PluggableExtentionKt.pluggableSpi$default(IInteractiveTaskIndexTracker.class, false, false, false, 14, null)) != null) {
                lValueOf = Long.valueOf(iInteractiveTaskIndexTracker.LIZJ(str2));
            }
        } else if (aIGroupShotCardTemplate != null && (str = aIGroupShotCardTemplate.taskId) != null) {
            lValueOf = Long.valueOf(C0ZTM.LIZIZ.LIZJ(str));
        }
        return new C462420IBk(lValueOf, zLIZJ, zBooleanValue, ((SkeletonLayoutAssemblerBridge) this.LLILZIL.getValue()).mN2(list, new C0ZOY(C898560ZMw.LIZ)).LIZ(list, c869590Y9l, i));
    }
}
