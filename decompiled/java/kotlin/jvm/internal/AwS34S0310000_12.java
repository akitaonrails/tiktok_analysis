package kotlin.jvm.internal;

import X.C013C;
import X.C08JS;
import X.C09AY;
import X.C11S5;
import X.C1397620mTQ;
import X.C16F5;
import X.C1701940uOG;
import X.C758220Toi;
import Y.AfS107S0300000_12;
import Y.AfS178S0100000_9;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.ss.android.ugc.aweme.detail.component.biz.TrashBinBottomComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AwS34S0310000_12 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS34S0310000_12 r8, java.lang.Object r9) {
        /*
            X.0Toi r9 = (X.C758220Toi) r9
            java.lang.Object r3 = r8.l2
            X.16F5 r3 = (X.C16F5) r3
            java.lang.Object r5 = r8.l1
            com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet r5 = (com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet) r5
            boolean r7 = r8.z3
            java.lang.String r0 = com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet._pnsPageId
            r6 = 0
            if (r9 == 0) goto Lc0
            int r0 = r9.LIZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L17:
            r2 = 0
            r4 = 1
            if (r1 == 0) goto Laa
            int r0 = r1.intValue()
            if (r0 != r4) goto L50
            r0 = 2131854520(0x7f1184b8, float:1.9342717E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r3.setText(r0)
        L2b:
            java.lang.Object r0 = r8.l0
            X.013C r0 = (X.C013C) r0
            boolean r0 = r0.element
            if (r0 == 0) goto L4d
            X.0ToO r1 = X.C758020ToO.LIZ
            java.lang.Object r0 = r8.l1
            com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet r0 = (com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r4 = r0.LLJLLL
            boolean r3 = r8.z3
            r1.getClass()
            java.lang.String r1 = "show"
            java.lang.String r0 = "chat_live"
            X.C758020ToO.LIZ(r4, r1, r0, r3, r2)
            java.lang.Object r0 = r8.l0
            X.013C r0 = (X.C013C) r0
            r0.element = r2
        L4d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L50:
            int r1 = r1.intValue()
            r0 = 2
            if (r1 != r0) goto Laa
            java.util.List<java.lang.Long> r0 = r9.LIZJ
            if (r0 == 0) goto L61
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L90
        L61:
            java.util.List<java.lang.Long> r0 = r9.LIZLLL
            if (r0 == 0) goto L90
            int r0 = r0.size()
            if (r0 != r4) goto L90
            java.util.List<java.lang.Long> r0 = r9.LIZLLL
            if (r0 == 0) goto L8e
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
        L73:
            java.lang.String r0 = r5.LLJZ
            if (r0 == 0) goto L8c
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
        L7b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L90
            r0 = 2131854521(0x7f1184b9, float:1.934272E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
        L88:
            r3.setText(r0)
            goto L2b
        L8c:
            r0 = r6
            goto L7b
        L8e:
            r1 = r6
            goto L73
        L90:
            r5.LLLFF = r4
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.util.List<java.lang.Long> r0 = r9.LIZIZ
            if (r0 == 0) goto La0
            int r0 = r0.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        La0:
            r1[r2] = r6
            r0 = 2131854522(0x7f1184ba, float:1.9342722E38)
            java.lang.String r0 = X.C497740JfY.LJIJJ(r0, r1)
            goto L88
        Laa:
            if (r7 == 0) goto Lb8
            r0 = 2131854519(0x7f1184b7, float:1.9342715E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
        Lb3:
            r3.setText(r0)
            goto L2b
        Lb8:
            r0 = 2131854518(0x7f1184b6, float:1.9342713E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            goto Lb3
        Lc0:
            r1 = r6
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS34S0310000_12.invoke$0(kotlin.jvm.internal.AwS34S0310000_12, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS34S0310000_12 awS34S0310000_12, Object obj) {
        BasePreviewSettingMainFragmentSheetInitializer.LJJIJ((View) awS34S0310000_12.l0, (C16F5) awS34S0310000_12.l1, (LiveIconView) awS34S0310000_12.l2, awS34S0310000_12.z3, (C758220Toi) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS34S0310000_12 awS34S0310000_12, Object obj) {
        List listSingletonList = Collections.singletonList(((Aweme) awS34S0310000_12.l0).getAid());
        AwS95S0210000_12 awS95S0210000_12 = new AwS95S0210000_12((Aweme) awS34S0310000_12.l0, (TrashBinBottomComponent) awS34S0310000_12.l1, awS34S0310000_12.z3, 0);
        AwS53S0310000_12 awS53S0310000_12 = new AwS53S0310000_12((Aweme) awS34S0310000_12.l0, (TrashBinBottomComponent) awS34S0310000_12.l1, awS34S0310000_12.z3, (View) awS34S0310000_12.l2, 0);
        ((TrashBinBottomComponent.TrashBinRestoreApiManager.TrashBinRestoreApi) TrashBinBottomComponent.TrashBinRestoreApiManager.LIZ.getValue()).trashBinRestore(C08JS.LIZLLL(listSingletonList)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS107S0300000_12(awS53S0310000_12, awS95S0210000_12, listSingletonList, 0), new AfS178S0100000_9(awS53S0310000_12, 13));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS34S0310000_12 awS34S0310000_12, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131844942, new AwS34S0310000_12((Aweme) awS34S0310000_12.l0, (TrashBinBottomComponent) awS34S0310000_12.l1, awS34S0310000_12.z3, (View) awS34S0310000_12.l2, 2));
        c1397620mTQ.LJII(2131844943, new AwS65S0210000_12((Aweme) awS34S0310000_12.l0, (TrashBinBottomComponent) awS34S0310000_12.l1, awS34S0310000_12.z3, 4));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S0310000_12(C013C c013c, GroupChatGoLiveSettingSheet groupChatGoLiveSettingSheet, boolean z, C16F5 c16f5, int i) {
        super(1);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = groupChatGoLiveSettingSheet;
        this.z3 = z;
        this.l2 = c16f5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S0310000_12(View view, C16F5 c16f5, LiveIconView liveIconView, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = c16f5;
        this.l2 = liveIconView;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S0310000_12(Aweme aweme, TrashBinBottomComponent trashBinBottomComponent, boolean z, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = trashBinBottomComponent;
        this.z3 = z;
        this.l2 = view;
    }
}
