package com.ss.android.ugc.aweme.sticker.types.lock;

import X.AbstractC1627380sS0;
import X.C01GW;
import X.C0CHQ;
import X.C0TIX;
import X.C0WIY;
import X.C1622820sKe;
import X.C1623350sLV;
import X.C1623370sLX;
import X.C1624130sMl;
import X.C1624170sMp;
import X.C1624200sMs;
import X.C1627370sRz;
import X.C19GS;
import X.C2188811AlT;
import X.C23117093z;
import X.C452501pT;
import X.EnumC1155090gAF;
import X.InterfaceC1159800gHq;
import X.InterfaceC1457290o1f;
import X.InterfaceC1622070sJR;
import X.InterfaceC1622080sJS;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625180sOS;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class LockStickerHandler implements InterfaceC1622080sJS, InterfaceC1159800gHq, GenericLifecycleObserver {
    public final C19GS LL;
    public final InterfaceC1624480sNK LLILLJJLI;
    public final Function1<InterfaceC1625180sOS<?>, Unit> LLILLL;
    public final Function0<Unit> LLILZ;
    public Effect LLILZIL;
    public int LLILZLL = -1;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final C01GW LLJ;

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZIZ() {
        ?? arrayList;
        if (!((Boolean) this.LLJ.getValue()).booleanValue() && this.LLIZLLLIL) {
            InterfaceC1457290o1f accountService = C0CHQ.LIZ().getAccountService();
            if (!accountService.isLogin() || TextUtils.isEmpty(accountService.getCurrentUserID())) {
                return;
            }
            InterfaceC1624480sNK interfaceC1624480sNK = this.LLILLJJLI;
            List<EffectCategoryModel> listLJFF = C23117093z.LJFF(interfaceC1624480sNK.getStickerRepository().LJFF());
            C0WIY c0wiy = new C0WIY(null, -1);
            if (!listLJFF.isEmpty()) {
                int size = listLJFF.size();
                int i = 0;
                loop0: while (true) {
                    if (i >= size) {
                        break;
                    }
                    CategoryEffectModel categoryEffectModelLIZ = C23117093z.LIZ(interfaceC1624480sNK.getStickerRepository().LJFF(), ((EffectCategoryModel) ListProtector.get(listLJFF, i)).getKey());
                    if (categoryEffectModelLIZ != null) {
                        int size2 = categoryEffectModelLIZ.getEffects().size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            Effect effect = (Effect) ListProtector.get(categoryEffectModelLIZ.getEffects(), i2);
                            if (C1624200sMs.LJIIJ(effect)) {
                                c0wiy = new C0WIY(effect, Integer.valueOf(i2));
                                break loop0;
                            }
                        }
                    }
                    i++;
                }
            }
            Effect effect2 = (Effect) c0wiy.LIZ;
            Integer num = (Integer) c0wiy.LIZIZ;
            if (effect2 == null) {
                return;
            }
            C19GS c19gs = this.LL;
            String currentUserID = accountService.getCurrentUserID();
            HashMap<String, List<String>> map = C1624170sMp.LIZ;
            if (map.keySet().contains(currentUserID)) {
                arrayList = (List) map.get(currentUserID);
                if (arrayList == 0) {
                    return;
                }
            } else {
                arrayList = new ArrayList(new C0TIX(c19gs, currentUserID).LIZIZ);
                map.put(currentUserID, (List<String>) arrayList);
                String strLIZIZ = "stickers had been reminded:";
                for (String str : arrayList) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(str);
                    sbLIZ.append(" , ");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            if (arrayList.isEmpty() || arrayList.contains(effect2.getEffectId()) || !C1624170sMp.LIZIZ(effect2)) {
                return;
            }
            C19GS c19gs2 = this.LL;
            String currentUserID2 = accountService.getCurrentUserID();
            String effectId = effect2.getEffectId();
            HashMap<String, List<String>> map2 = C1624170sMp.LIZ;
            if (map2.keySet().contains(currentUserID2)) {
                map2.get(currentUserID2).add(effectId);
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(effectId);
                map2.put(currentUserID2, arrayList2);
            }
            C0TIX c0tix = new C0TIX(c19gs2, currentUserID2);
            if (c0tix.LIZIZ.add(effectId)) {
                c0tix.LIZ.putStringSet("remindedIds", c0tix.LIZIZ);
                c0tix.LIZ.apply();
            }
            this.LLILZIL = effect2;
            this.LLILZLL = num.intValue();
            LIZ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LLIZ) {
            LIZJ();
        }
    }

    public final void LIZ() {
        C0CHQ.LIZ().unlockStickerService().getClass();
        new C1624130sMl();
    }

    public final void LIZJ() {
        C0CHQ.LIZ().unlockStickerService().getClass();
        this.LLILZ.invoke();
        Effect effect = this.LLILZIL;
        if (effect != null) {
            this.LLILLL.invoke(C1622820sKe.LIZIZ(effect, this.LLILZLL, null, null, null, null, null, 0, false, null, null, 1022));
        }
        this.LLIZ = false;
    }

    @Override // X.InterfaceC1622080sJS
    public final int getPriority() {
        return C1623350sLV.LIZ();
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
        LIZIZ();
    }

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
        this.LLIZLLLIL = true;
        LIZIZ();
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
        this.LLIZLLLIL = false;
    }

    @Override // X.InterfaceC1622080sJS
    public final C1623370sLX LJIILL(InterfaceC1622070sJR interfaceC1622070sJR, AbstractC1627380sS0 abstractC1627380sS0) {
        if (abstractC1627380sS0 instanceof C1627370sRz) {
            C1627370sRz c1627370sRz = (C1627370sRz) abstractC1627380sS0;
            if (C1624170sMp.LIZIZ(c1627370sRz.LIZ)) {
                C1623370sLX c1623370sLXLIZ = interfaceC1622070sJR.LIZ(C1627370sRz.LIZIZ(c1627370sRz));
                this.LLILZIL = c1627370sRz.LIZ;
                LIZ();
                return c1623370sLXLIZ;
            }
        }
        return interfaceC1622070sJR.LIZ(abstractC1627380sS0);
    }

    public LockStickerHandler(C19GS c19gs, Lifecycle lifecycle, InterfaceC1624480sNK interfaceC1624480sNK, AwS604S0100000_25 awS604S0100000_25, AwS569S0100000_25 awS569S0100000_25) {
        this.LL = c19gs;
        this.LLILLJJLI = interfaceC1624480sNK;
        this.LLILLL = awS604S0100000_25;
        this.LLILZ = awS569S0100000_25;
        new OnUnlockShareFinishListener() { // from class: X.0sMk
            @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
            public final void onShareAppFailed() {
                InterfaceC1624140sMm interfaceC1624140sMmUnlockStickerService = C0CHQ.LIZ().unlockStickerService();
                C19GS c19gs2 = this.LIZ.LL;
                interfaceC1624140sMmUnlockStickerService.getClass();
                C1627480sSA.LIZ(c19gs2);
            }

            @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
            public final void onShareAppSucceed(Effect effect) {
                this.LIZ.LLIZ = true;
            }

            @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
            public final void onVKShareSucceed(Effect effect) {
                this.LIZ.LIZJ();
            }
        };
        lifecycle.addObserver(this);
        this.LLJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1973));
    }
}
