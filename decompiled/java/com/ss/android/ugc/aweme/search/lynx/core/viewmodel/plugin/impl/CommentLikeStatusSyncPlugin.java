package com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl;

import X.AbstractC1156450gCR;
import X.C08CX;
import X.C1156440gCQ;
import X.C1156460gCS;
import X.C1339950kyP;
import X.C13IQ;
import X.C13LQ;
import X.C1D61;
import X.C1D63;
import X.C1D6D;
import X.C650300Pf2;
import X.EnumC115000c8;
import X.InterfaceC2250311D5x;
import X.InterfaceC650320Pf4;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public final class CommentLikeStatusSyncPlugin implements InterfaceC2250311D5x {
    public static final int $stable = 8;
    public InterfaceC650320Pf4<C1339950kyP> commentEventListener;
    public final Set<C1D61> lifecycleStages = C13LQ.LJLIIL(new C1D6D[]{C1D6D.ON_BEFORE_CONTEXT_CREATE, C1D6D.ON_VIEW_CREATE});

    @Override // X.InterfaceC2250311D5x
    public int getPriority() {
        return 10;
    }

    @Override // X.InterfaceC2250311D5x
    public void destroy() {
        InterfaceC650320Pf4<C1339950kyP> interfaceC650320Pf4 = this.commentEventListener;
        if (interfaceC650320Pf4 != null) {
            C650300Pf2.LIZLLL.LJFF(interfaceC650320Pf4);
        }
        this.commentEventListener = null;
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

    private final void registerCommentListener(final C1D63 c1d63) {
        InterfaceC650320Pf4<C1339950kyP> interfaceC650320Pf4 = new InterfaceC650320Pf4<C1339950kyP>() { // from class: X.0QBk
            @Override // X.InterfaceC650320Pf4
            public final Class<C1339950kyP> LIZ() {
                return C1339950kyP.class;
            }

            @Override // X.InterfaceC650320Pf4
            public final void LIZIZ(C1339950kyP c1339950kyP) throws JSONException {
                C1339950kyP c1339950kyP2 = c1339950kyP;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cid", c1339950kyP2.LIZ);
                jSONObject.put("diggCount", c1339950kyP2.LIZJ);
                boolean z = true;
                if (c1339950kyP2.LIZIZ != 1) {
                    z = false;
                }
                jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, z);
                C1537480q70 c1537480q70 = c1d63.LIZJ;
                if (c1537480q70 != null) {
                    c1537480q70.LJJIIJZLJL(jSONObject, "changeCommentDiggState");
                }
            }
        };
        this.commentEventListener = interfaceC650320Pf4;
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
            registerCommentListener(c1d63);
        }
        return new C1156440gCQ(EnumC115000c8.SUCCESS);
    }
}
