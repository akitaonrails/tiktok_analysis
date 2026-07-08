package com.bytedance.android.livesdk.broadcast.interaction.function.perception;

import X.C01GW;
import X.C0IJT;
import X.C16F5;
import X.C20736316Cj;
import X.C21578619ce;
import X.C452501pT;
import X.C466310IQj;
import X.C474500IjA;
import X.C475510Ikn;
import X.C500060JjI;
import X.C510160Jza;
import X.C782100Um8;
import X.C786410Ut5;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.broadcast.PerceptionDialogDismissedChannel;
import com.bytedance.android.livesdk.message.proto.PerceptionSheetInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LivePerceptionLiveSheetFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4ZyY9PCA+KCwnISoiZyHELIOSkmJiY4ICA9ZjUpOyw2ODElJiF9BCw6LB82OiYpOTs6JysAIDk2Gy0pLDsVOiQrJCo9PA==";
    public LiveIconView LLJLLL;
    public C16F5 LLJZ;
    public C16F5 LLJZIJLIL;
    public C16F5 LLL;
    public C16F5 LLLF;
    public C16F5 LLLFF;
    public C16F5 LLLFFI;
    public C21578619ce LLLFZ;
    public C466310IQj LLLI;
    public PerceptionMessage LLLII;
    public boolean LLLIIIIL;
    public final MutableLiveData<Long> LLLIIII = new MutableLiveData<>();
    public final C01GW LLLIIIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(51));
    public final C01GW LLLIIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 161));

    public final void yS() {
        PunishEventInfo punishEventInfo;
        this.LLLIIIIL = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_violation_warning_total_show");
        c474500IjALIZ.LJIL();
        PerceptionMessage perceptionMessage = this.LLLII;
        c474500IjALIZ.LJJII((perceptionMessage == null || (punishEventInfo = perceptionMessage.publicEventInfo) == null) ? null : punishEventInfo.punishId, "record_id");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        ArrayList arrayList = new ArrayList();
        arrayList.add(uS());
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    public final C510160Jza uS() {
        return (C510160Jza) this.LLLIIL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS112S0100000_12(C475510Ikn.LJ(this), 53));
        this.LLLII = null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        wS(System.currentTimeMillis() - ((Number) this.LLLIIIL.getValue()).longValue(), "click");
        C466310IQj c466310IQj = this.LLLI;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
        this.LLLI = null;
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
        this.LLLF = null;
        this.LLLFF = null;
        this.LLLFFI = null;
        this.LLLFZ = null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.fx2, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!this.LLLIIIIL) {
            View viewFindViewById = this.LLLFZ;
            if (viewFindViewById == null) {
                View view = getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.q8n);
                } else {
                    viewFindViewById = null;
                }
                this.LLLFZ = (C21578619ce) viewFindViewById;
            }
            if (!viewFindViewById.canScrollVertically(1)) {
                yS();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b A[LOOP:0: B:48:0x0105->B:50:0x010b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021a  */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.interaction.function.perception.LivePerceptionLiveSheetFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void wS(long j, String str) {
        String str2;
        PerceptionSheetInfo perceptionSheetInfo;
        PunishEventInfo punishEventInfo;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_violation_warning");
        c474500IjALIZ.LJIL();
        PerceptionMessage perceptionMessage = this.LLLII;
        Long lValueOf = null;
        if (perceptionMessage != null && (punishEventInfo = perceptionMessage.publicEventInfo) != null) {
            str2 = punishEventInfo.punishId;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "record_id");
        PerceptionMessage perceptionMessage2 = this.LLLII;
        if (perceptionMessage2 != null && (perceptionSheetInfo = perceptionMessage2.sheet) != null) {
            lValueOf = Long.valueOf(perceptionSheetInfo.countDownTime);
        }
        c474500IjALIZ.LJJII(lValueOf, "setting_duration");
        c474500IjALIZ.LJJII(Long.valueOf(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "stay_duration");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PerceptionMessage perceptionMessage;
        this.LLJJJJLIIL = false;
        this.LLJJL = false;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            perceptionMessage = (PerceptionMessage) dataChannelLJ.gg0(C782100Um8.class);
        } else {
            perceptionMessage = null;
        }
        this.LLLII = perceptionMessage;
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 != null) {
            dataChannelLJ2.zW(PerceptionDialogDismissedChannel.class, Boolean.FALSE);
        }
        return C786410Ut5.Td(layoutInflater, R.layout.hgb, viewGroup, false);
    }
}
