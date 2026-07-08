package com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel;

import X.C01GW;
import X.C03H5;
import X.C698160Ra2;
import X.C703580Rim;
import X.C703600Rio;
import X.C703610Rip;
import X.C724270Sb3;
import X.InterfaceC702850Rhb;
import X.InterfaceC703750Rj3;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.annotation.api.ComponentElementChangeAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class InfoBarLabelTriggerComponent<RECEIVER extends C03H5> extends BottomLabelTriggerComponent<RECEIVER> implements InterfaceC702850Rhb {
    public final /* synthetic */ C703600Rio<VideoItemParams, C698160Ra2> LLJLIL;
    public final boolean LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final boolean LLJLLIL;

    public InfoBarLabelTriggerComponent() {
        this(false);
    }

    public final void Bp(String str, Function1<? super C698160Ra2, Unit> function1) {
        this.LLJLIL.LIZJ(str, function1);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC702850Rhb
    public final InterfaceC703750Rj3 gc() {
        return this.LLJLIL.gc();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public void unBind() {
        C703610Rip<VideoItemParams, ELEMENT> c703610Rip = this.LLJLIL.LL;
        Function0<Unit> function0 = c703610Rip.LIZLLL;
        if (function0 != null) {
            function0.invoke();
        }
        Function0<Unit> function02 = c703610Rip.LJ;
        if (function02 != null) {
            function02.invoke();
        }
        C703580Rim c703580Rim = c703610Rip.LIZ;
        if (c703580Rim != null) {
            c703580Rim.LIZ(null, "clear_store_action");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        if (this.LLJLILLLLZIIL) {
            getContext();
            this.LLJLIL.LIZIZ(new AwS590S0100000_11((InfoBarLabelTriggerComponent) this, 345), (ComponentElementChangeAbility) this.LLJLL.getValue());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean op() {
        return this.LLJLILLLLZIIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InfoBarLabelTriggerComponent(boolean r3) {
        /*
            r2 = this;
            r2.<init>()
            X.0Rio r0 = new X.0Rio
            r0.<init>()
            r2.LLJLIL = r0
            r2.LLJLILLLLZIIL = r3
            kotlin.jvm.internal.AwS555S0100000_11 r1 = new kotlin.jvm.internal.AwS555S0100000_11
            r0 = 1239(0x4d7, float:1.736E-42)
            r1.<init>(r2, r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r1)
            r2.LLJLL = r0
            X.01GW r0 = X.C693530RIh.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.feed.platform.ab.AnnotationContainerPerfConfig r0 = (com.ss.android.ugc.feed.platform.ab.AnnotationContainerPerfConfig) r0
            if (r0 == 0) goto L2b
            boolean r1 = r0.enable
            r0 = 1
            if (r1 != r0) goto L2b
        L28:
            r2.LLJLLIL = r0
            return
        L2b:
            r0 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.InfoBarLabelTriggerComponent.<init>(boolean):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        if (!this.LLJLILLLLZIIL) {
            super.onViewCreated(view);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public void up(VideoItemParams videoItemParams) {
        if (!this.LLJLILLLLZIIL) {
            tp(videoItemParams);
        } else {
            if (this.LLJLLIL) {
                return;
            }
            this.LLJLIL.LIZ(videoItemParams);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.BottomLabelTriggerComponent
    public final void yp(ComponentPriorityProtocol componentPriorityProtocol, Function0<Unit> function0, Function0<Unit> function02) {
        Object obj;
        if (this.LLJLILLLLZIIL) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            Object obj2 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (up((VideoItemParams) obj) && this.LLJLLIL) {
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                }
                this.LLJLIL.LIZ((VideoItemParams) obj2);
            }
        }
        super.yp(componentPriorityProtocol, function0, function02);
    }
}
