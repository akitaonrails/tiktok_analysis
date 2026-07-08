package com.ss.android.ugc.feed.platform.cell.trigger;

import X.AbstractC634910OvJ;
import X.C0RJN;
import X.C19719912Dl;
import X.C1AV3;
import X.C2180521AVm;
import X.C688590Qzh;
import X.C690870R8b;
import X.C694010RKd;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C844470XAv;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbsComponentTrigger extends AbstractC634910OvJ<VideoItemParams> implements PriorityProtocol {
    public C694010RKd LLIZ;
    public View LLIZLLLIL;
    public C690870R8b LLJ;
    public C0RJN LLJI;
    public DynamicComponent<?> LLJIJIL;

    public C700450Rdj Ke1() {
        return null;
    }

    public boolean Kj() {
        return false;
    }

    public abstract boolean LJIIJ(VideoItemParams videoItemParams, C690870R8b c690870R8b);

    public abstract C19719912Dl LJIIJJI();

    public abstract PriorityAbility LJIILIIL();

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    public final void LJIIZILJ() {
        View view = this.LLIZLLLIL;
        if (view != null) {
            C2180521AVm.LIZLLL(view, 8, C1AV3.LIZ(1, "Feed", null, "framework"));
        }
    }

    public final void LJIJJLI() {
        ReusedAssem<?> reusedAssem;
        Object objBo = this.LLILZLL;
        if (objBo != null || ((reusedAssem = this.LLILLL) != null && (objBo = reusedAssem.bo()) != null)) {
            LIZLLL(objBo);
        }
        LJJ(this.LLILLJJLI);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View Vt() {
        if (this.LLIZLLLIL == null) {
            C694010RKd c694010RKd = this.LLIZ;
            this.LLIZLLLIL = c694010RKd != null ? (View) c694010RKd.invoke() : null;
        }
        View view = this.LLIZLLLIL;
        if (view != null) {
            return view;
        }
        C844470XAv.LIZ.getClass();
        View view2 = new View(C844470XAv.LIZ());
        view2.setId(R.id.hr5);
        return view2;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return zg();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        C688590Qzh.LIZLLL(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        C688590Qzh.LIZJ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        C688590Qzh.LIZIZ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return Vt();
    }

    @Override // X.AbstractC634910OvJ
    public final boolean LJII(VideoItemParams videoItemParams) {
        return LJIIJ(videoItemParams, this.LLJ);
    }

    public final void LJJ(boolean z) {
        View view;
        View view2 = this.LLIZLLLIL;
        if (view2 != null) {
            C2180521AVm.LIZLLL(view2, 8, C1AV3.LIZ(1, "Feed", null, "framework"));
        }
        if (z) {
            if (this.LLIZLLLIL == null) {
                C694010RKd c694010RKd = this.LLIZ;
                if (c694010RKd != null) {
                    view = (View) c694010RKd.invoke();
                } else {
                    view = null;
                }
                this.LLIZLLLIL = view;
            }
            LJI(null);
            PriorityAbility priorityAbilityLJIILIIL = LJIILIIL();
            if (priorityAbilityLJIILIIL != null) {
                priorityAbilityLJIILIIL.Vx0(this, new AwS590S0100000_11(this, 361), new AwS590S0100000_11(this, 362));
                return;
            }
            return;
        }
        LJIIZILJ();
    }
}
