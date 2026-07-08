package com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl;

import X.AbstractC1156450gCR;
import X.C08CX;
import X.C0O2O;
import X.C1156440gCQ;
import X.C1156460gCS;
import X.C13IQ;
import X.C1D61;
import X.C1D63;
import X.C1D6D;
import X.C2250391D6f;
import X.EnumC115000c8;
import X.InterfaceC2250311D5x;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import java.util.Collections;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public final class VideoCollectStatusSyncPlugin implements InterfaceC2250311D5x {
    public static final String TYPE = "type";
    public C0O2O awemeCollectStateSubscriber;
    public final Set<C1D61> lifecycleStages = Collections.singleton(C1D6D.ON_VIEW_CREATE);
    public static final C2250391D6f Companion = new Object() { // from class: X.1D6f
    };
    public static final int $stable = 8;

    @Override // X.InterfaceC2250311D5x
    public int getPriority() {
        return 10;
    }

    @Override // X.InterfaceC2250311D5x
    public void destroy() {
        IStateNotifier iStateNotifier = (IStateNotifier) PluggableExtentionKt.pluggableSpi$default(IAwemeCollectionStateNotifier.class, false, false, false, 14, null);
        if (iStateNotifier != null) {
            iStateNotifier.removeSubscriber(this.awemeCollectStateSubscriber);
        }
    }

    @Override // X.InterfaceC2250311D5x
    public Set<C13IQ<? extends InterfaceC2250311D5x>> getDependencies() {
        return C08CX.INSTANCE;
    }

    @Override // X.InterfaceC2250311D5x
    public Set<C1D61> getLifecycleStages() {
        return this.lifecycleStages;
    }

    @Override // X.InterfaceC2250311D5x
    public AbstractC1156450gCR<?> executeDependencyReady(C1D63 c1d63) {
        return C1156460gCS.LIZ;
    }

    @Override // X.InterfaceC2250311D5x
    public AbstractC1156450gCR<?> executeImmediate(final C1D63 c1d63) {
        C0O2O c0o2o = new C0O2O() { // from class: X.0QBl
            @Override // X.C0O2O
            public final void Wz(String str, boolean z, EnumC612200Nzm enumC612200Nzm) throws JSONException {
                C1537480q70 c1537480q70;
                if (enumC612200Nzm == EnumC612200Nzm.MUTATION && (c1537480q70 = c1d63.LIZJ) != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("itemID", str);
                    jSONObject.put("action", z);
                    jSONObject.put("type", 2);
                    c1537480q70.LJJIIJZLJL(jSONObject, "changeCollectStatus");
                }
            }

            @Override // X.InterfaceC612260Nzs
            public final void xt(String str, Boolean bool, EnumC612200Nzm enumC612200Nzm) throws JSONException {
                Wz(str, bool.booleanValue(), enumC612200Nzm);
            }
        };
        this.awemeCollectStateSubscriber = c0o2o;
        IStateNotifier iStateNotifier = (IStateNotifier) PluggableExtentionKt.pluggableSpi$default(IAwemeCollectionStateNotifier.class, false, false, false, 14, null);
        if (iStateNotifier != null) {
            iStateNotifier.addSubscriber(c0o2o);
        }
        return new C1156440gCQ(EnumC115000c8.SUCCESS);
    }
}
