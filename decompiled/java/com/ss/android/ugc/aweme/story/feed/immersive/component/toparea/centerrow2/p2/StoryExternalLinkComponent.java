package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p2;

import X.C1390920mIc;
import X.C197039127h;
import X.C20684815ws;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C706480RnS;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryExternalLinkComponent extends BaseCellSlotComponent<StoryExternalLinkComponent> {
    public TuxSheet LLJLLIL;
    public C197039127h LLJLLL;
    public C197039127h LLJZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fc9;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 770);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_external_link_view", true, awS555S0100000_11);
    }

    public static void Ep(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("event_type", str);
        C20684815ws.LJIILLIIL("leave_notification_bottom_banner", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewLJLLJ = C786410Ut5.LJLLJ(getContext(), R.layout.fb_, null);
        this.LLJZ = (C197039127h) viewLJLLJ.findViewById(R.id.cuh);
        this.LLJLLL = (C197039127h) viewLJLLJ.findViewById(R.id.csc);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIII = viewLJLLJ;
        c1390920mIc.LJIIIIZZ(1);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(444));
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = iLIZIZ;
        tuxSheet.LLJJIJIIJIL = true;
        this.LLJLLIL = tuxSheet;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return this.LLJLILLLLZIIL.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[Catch: Exception -> 0x00c8, TryCatch #0 {Exception -> 0x00c8, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0012, B:12:0x001b, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:24:0x0055, B:25:0x006b, B:26:0x007a, B:28:0x00af, B:29:0x00b9, B:31:0x00bd), top: B:36:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: Exception -> 0x00c8, TryCatch #0 {Exception -> 0x00c8, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0012, B:12:0x001b, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:24:0x0055, B:25:0x006b, B:26:0x007a, B:28:0x00af, B:29:0x00b9, B:31:0x00bd), top: B:36:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af A[Catch: Exception -> 0x00c8, TryCatch #0 {Exception -> 0x00c8, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0012, B:12:0x001b, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:24:0x0055, B:25:0x006b, B:26:0x007a, B:28:0x00af, B:29:0x00b9, B:31:0x00bd), top: B:36:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd A[Catch: Exception -> 0x00c8, TryCatch #0 {Exception -> 0x00c8, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0012, B:12:0x001b, B:14:0x003f, B:16:0x0043, B:18:0x0047, B:24:0x0055, B:25:0x006b, B:26:0x007a, B:28:0x00af, B:29:0x00b9, B:31:0x00bd), top: B:36:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r5) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p2.StoryExternalLinkComponent.up(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }
}
