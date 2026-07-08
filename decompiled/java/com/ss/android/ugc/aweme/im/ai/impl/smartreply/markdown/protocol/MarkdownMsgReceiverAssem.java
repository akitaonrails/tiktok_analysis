package com.ss.android.ugc.aweme.im.ai.impl.smartreply.markdown.protocol;

import X.AnonymousClass0956;
import X.C098200Yq;
import X.C09AE;
import X.C0ZS9;
import X.C0ZXS;
import X.C0ZXX;
import X.C189200o6;
import X.C898900ZOe;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MarkdownMsgReceiverAssem extends MarkdownMsgAssem<C0ZS9> {
    @Override // com.ss.android.ugc.aweme.im.ai.impl.smartreply.markdown.protocol.MarkdownMsgAssem
    public final boolean up() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.ai.impl.smartreply.markdown.protocol.MarkdownMsgAssem
    public final void op(C0ZXS c0zxs) {
        View view;
        try {
            super.op(c0zxs);
            C09AE c09ae = this.LLJLILLLLZIIL;
            AnonymousClass0956 anonymousClass0956LJII = null;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
            if (iIMMessageBubbleService != null) {
                C898900ZOe c898900ZOe = (C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue();
                if (c898900ZOe != null && (view = c898900ZOe.LL) != null) {
                    anonymousClass0956LJII = iIMMessageBubbleService.LJII(view, c0zxs, false, LifecycleOwnerKt.getLifecycleScope(this), AFwS201S0000000_14.get$arr$(87), AFwS248S0000000_14.get$arr$(67), C0ZXX.LIZ);
                } else {
                    return;
                }
            }
            this.LLJLILLLLZIIL = anonymousClass0956LJII;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
