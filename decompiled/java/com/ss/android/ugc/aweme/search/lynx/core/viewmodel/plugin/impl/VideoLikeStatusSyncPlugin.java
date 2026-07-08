package com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl;

import X.AbstractC1156450gCR;
import X.C08CX;
import X.C1156440gCQ;
import X.C1156460gCS;
import X.C13IQ;
import X.C13LQ;
import X.C1537480q70;
import X.C1D61;
import X.C1D63;
import X.C1D6D;
import X.C650300Pf2;
import X.C651640PhC;
import X.C737030Svd;
import X.EnumC115000c8;
import X.InterfaceC2250311D5x;
import X.InterfaceC650320Pf4;
import android.os.Bundle;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public final class VideoLikeStatusSyncPlugin implements InterfaceC2250311D5x {
    public static final int $stable = 8;
    public final Set<C1D61> lifecycleStages = C13LQ.LJLIIL(new C1D6D[]{C1D6D.ON_BEFORE_CONTEXT_CREATE, C1D6D.ON_VIEW_CREATE});
    public InterfaceC650320Pf4<C737030Svd> videoEventListener;

    @Override // X.InterfaceC2250311D5x
    public int getPriority() {
        return 10;
    }

    @Override // X.InterfaceC2250311D5x
    public void destroy() {
        InterfaceC650320Pf4<C737030Svd> interfaceC650320Pf4 = this.videoEventListener;
        if (interfaceC650320Pf4 != null) {
            C650300Pf2.LIZLLL.LJFF(interfaceC650320Pf4);
        }
        this.videoEventListener = null;
        C650300Pf2.LIZLLL.LJ();
    }

    @Override // X.InterfaceC2250311D5x
    public Set<C13IQ<? extends InterfaceC2250311D5x>> getDependencies() {
        return C08CX.INSTANCE;
    }

    @Override // X.InterfaceC2250311D5x
    public Set<C1D61> getLifecycleStages() {
        return this.lifecycleStages;
    }

    private final void registerVideoListener(final C1D63 c1d63) {
        InterfaceC650320Pf4<C737030Svd> interfaceC650320Pf4 = new InterfaceC650320Pf4<C737030Svd>() { // from class: X.1D6a
            @Override // X.InterfaceC650320Pf4
            public final Class<C737030Svd> LIZ() {
                return C737030Svd.class;
            }

            @Override // X.InterfaceC650320Pf4
            public final void LIZIZ(C737030Svd c737030Svd) throws JSONException {
                C737030Svd c737030Svd2 = c737030Svd;
                if (c737030Svd2.LIZ == 13) {
                    this.LIZ.dispatchDiggUpdate(c1d63, c737030Svd2);
                }
            }
        };
        this.videoEventListener = interfaceC650320Pf4;
        C650300Pf2.LIZLLL.LIZ(interfaceC650320Pf4);
    }

    @Override // X.InterfaceC2250311D5x
    public AbstractC1156450gCR<?> executeDependencyReady(C1D63 c1d63) {
        return C1156460gCS.LIZ;
    }

    @Override // X.InterfaceC2250311D5x
    public AbstractC1156450gCR<?> executeImmediate(C1D63 c1d63) {
        C1D61 c1d61 = c1d63.LIZ.LIZ;
        if (c1d61 == C1D6D.ON_BEFORE_CONTEXT_CREATE) {
            C650300Pf2.LIZLLL.LIZLLL();
        } else if (c1d61 == C1D6D.ON_VIEW_CREATE) {
            registerVideoListener(c1d63);
        }
        return new C1156440gCQ(EnumC115000c8.SUCCESS);
    }

    public final void dispatchDiggUpdate(C1D63 c1d63, C737030Svd c737030Svd) throws JSONException {
        String str;
        Integer numValueOf;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aid", c737030Svd.LIZIZ);
        Bundle bundle = c737030Svd.LIZJ;
        Integer numValueOf2 = null;
        if (bundle != null && (numValueOf = Integer.valueOf(bundle.getInt("user_digged"))) != null) {
            jSONObject.put("dig_status", numValueOf.intValue());
        }
        C1537480q70 c1537480q70 = c1d63.LIZJ;
        if (c1537480q70 != null) {
            c1537480q70.LJJIIJZLJL(jSONObject, "changeDiggState");
        }
        C651640PhC c651640PhC = C651640PhC.LIZIZ;
        Object obj = c737030Svd.LIZIZ;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Bundle bundle2 = c737030Svd.LIZJ;
        if (bundle2 != null) {
            numValueOf2 = Integer.valueOf(bundle2.getInt("user_digged"));
        }
        c651640PhC.LJIIIZ(numValueOf2, str);
    }
}
