package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C01GW;
import X.C0IJT;
import X.C0UPF;
import X.C0WZX;
import X.C1548820qPI;
import X.C1871910yoP;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C262100zr;
import X.C354201Zc;
import X.C452501pT;
import X.C474500IjA;
import X.C500260Jjc;
import X.C751980Tee;
import X.C771670UOv;
import X.C786120Usc;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.broadcast.PreviewHideKeyboardEvent;
import com.bytedance.android.livesdk.broadcast.PreviewLiveModeTitleChannel;
import com.bytedance.android.livesdk.broadcast.PreviewPromoteTopicChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewTitleWidget extends PreviewWidget implements InterfaceC1141530foN {
    public LiveEditText LLILZLL;
    public String LLIZLLLIL;
    public final String LLILZ = "promote_change_topic";
    public final C01GW LLILZIL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new AwS556S0100000_12(this, 182));
    public String LLIZ = "";
    public final C786120Usc LLJ = new C786120Usc(this, 6);

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void D1() {
        this.LLILLL = false;
        C0UPF c0upfLJ = C771670UOv.LJ();
        if (c0upfLJ != null) {
            c0upfLJ.LIZLLL = null;
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i1u;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        String str;
        LiveMode liveModeLIZJ;
        if (C500260Jjc.LJJIIZ(this.LLIZLLLIL)) {
            Map map = (Map) this.dataChannel.gg0(PreviewLiveModeTitleChannel.class);
            if (map != null) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel == null || (liveModeLIZJ = C751980Tee.LIZJ(dataChannel)) == null) {
                    liveModeLIZJ = LiveMode.VIDEO;
                }
                str = (String) map.get(liveModeLIZJ);
            } else {
                str = null;
            }
            I1(str);
        }
        C0UPF c0upfLJ = C771670UOv.LJ();
        if (c0upfLJ != null) {
            c0upfLJ.LIZLLL = new AwS591S0100000_12(this, 332);
        }
        super.C1();
    }

    public final void G1() {
        LiveEditText liveEditText = this.LLILZLL;
        if (liveEditText == null) {
            liveEditText = null;
        }
        liveEditText.setHint(2131840910);
        LiveEditText liveEditText2 = this.LLILZLL;
        if (liveEditText2 == null) {
            liveEditText2 = null;
        }
        CharSequence hint = liveEditText2.getHint();
        if (hint != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((Object) hint);
            sbLIZ.append(' ');
            SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.p2(spannableString, H1(), hint.length(), hint.length() + 1, 17);
            LiveEditText liveEditText3 = this.LLILZLL;
            (liveEditText3 != null ? liveEditText3 : null).setHint(spannableString);
        }
    }

    public final ImageSpan H1() {
        return (ImageSpan) this.LLILZIL.getValue();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        LiveEditText liveEditText;
        LiveMode liveModeLIZJ;
        Pair pair;
        LiveMode liveModeLIZJ2;
        super.E1();
        View view = getView();
        String strLIZ = null;
        if (!(view instanceof LiveEditText) || (liveEditText = (LiveEditText) view) == null) {
            return;
        }
        this.LLILZLL = liveEditText;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, PreviewHideKeyboardEvent.class, new AwS591S0100000_12(this, 333));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (pair = (Pair) dataChannel2.gg0(PreviewPromoteTopicChannel.class)) != null && C500260Jjc.LJJIIZ((CharSequence) pair.getSecond())) {
            I1((String) pair.getSecond());
            this.LLIZLLLIL = (String) pair.getSecond();
            Map map = (Map) this.dataChannel.gg0(PreviewLiveModeTitleChannel.class);
            if (map != null) {
                DataChannel dataChannel3 = this.dataChannel;
                if (dataChannel3 == null || (liveModeLIZJ2 = C751980Tee.LIZJ(dataChannel3)) == null) {
                    liveModeLIZJ2 = LiveMode.VIDEO;
                }
                map.put(liveModeLIZJ2, pair.getSecond());
            }
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.EQ2(this, LiveModeChannel.class, new AwS591S0100000_12(this, 334));
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 335));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_component_show");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII("title", "component_name");
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null && (liveModeLIZJ = C751980Tee.LIZJ(dataChannel6)) != null) {
            strLIZ = C354201Zc.LIZ(liveModeLIZJ);
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LIZ();
        C1548820qPI.LIZLLL(this.LLILZ, this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ(this.LLILZ, this);
    }

    public final void I1(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        LiveEditText liveEditText = null;
        if (z) {
            LiveEditText liveEditText2 = this.LLILZLL;
            if (liveEditText2 != null) {
                liveEditText = liveEditText2;
            }
            liveEditText.setText("");
            G1();
            return;
        }
        LiveEditText liveEditText3 = this.LLILZLL;
        if (liveEditText3 == null) {
            liveEditText3 = null;
        }
        if (liveEditText3.isFocused()) {
            LiveEditText liveEditText4 = this.LLILZLL;
            if (liveEditText4 == null) {
                liveEditText4 = null;
            }
            if (!TextUtils.isEmpty(String.valueOf(C2204961BRm.LLLFZ(liveEditText4, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQo+Qr413fkoPPgfwZtEL4XEOjQ==", null))))) {
                LiveEditText liveEditText5 = this.LLILZLL;
                if (liveEditText5 != null) {
                    liveEditText = liveEditText5;
                }
                liveEditText.setText(str);
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(' ');
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.p2(spannableString, H1(), str.length(), str.length() + 1, 17);
        LiveEditText liveEditText6 = this.LLILZLL;
        if (liveEditText6 != null) {
            liveEditText = liveEditText6;
        }
        liveEditText.setText(spannableString);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        LiveMode liveModeLIZJ;
        if (Intrinsics.LJFF(c262100zr.LIZ, this.LLILZ)) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            String strLJFF2 = null;
            if (interfaceC1107590evd != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "promote_topic_id", "");
            } else {
                strLJFF = null;
            }
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd2, "promote_topic_name", "");
            }
            if (strLJFF != null && C500260Jjc.LJJIIZ(strLJFF) && strLJFF2 != null && C500260Jjc.LJJIIZ(strLJFF2)) {
                I1(strLJFF2);
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.zW(PreviewPromoteTopicChannel.class, new Pair(strLJFF, strLJFF2));
                }
                Map map = (Map) this.dataChannel.gg0(PreviewLiveModeTitleChannel.class);
                if (map != null) {
                    DataChannel dataChannel2 = this.dataChannel;
                    if (dataChannel2 == null || (liveModeLIZJ = C751980Tee.LIZJ(dataChannel2)) == null) {
                        liveModeLIZJ = LiveMode.VIDEO;
                    }
                    map.put(liveModeLIZJ, strLJFF2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J1(com.bytedance.android.live.broadcast.model.RoomCreateInfo r12, com.bytedance.android.livesdkapi.depend.model.live.LiveMode r13) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewTitleWidget.J1(com.bytedance.android.live.broadcast.model.RoomCreateInfo, com.bytedance.android.livesdkapi.depend.model.live.LiveMode):void");
    }
}
