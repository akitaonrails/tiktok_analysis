package com.ss.android.ugc.aweme.commercialize.widget;

import X.C01GW;
import X.C1035130d2l;
import X.C12ES;
import X.C1355730lNr;
import X.C2344809Gs;
import X.C341940Daq;
import X.C428830Grh;
import X.C431060GvI;
import X.C431080GvK;
import X.C444960Hcc;
import X.C452501pT;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1355720lNq;
import Y.ACListenerS146S0100000_11;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class AdFakeUserProfileVideoDescWidget extends AbsAdProfileWidget {
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 112));

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIILL(C1035130d2l c1035130d2l) {
        String desc;
        List<TextExtraStruct> textExtra;
        int i;
        super.LJIILL(c1035130d2l);
        Aweme aweme = this.LLIZLLLIL;
        if (aweme != null && (desc = aweme.getDesc()) != null) {
            C1355730lNr c1355730lNr = (C1355730lNr) this.LLJIJIL.getValue();
            if (c1355730lNr != null) {
                c1355730lNr.setText(desc);
                Aweme aweme2 = this.LLIZLLLIL;
                if (aweme2 != null && (textExtra = aweme2.getTextExtra()) != null) {
                    for (TextExtraStruct textExtraStruct : textExtra) {
                        if (textExtraStruct != null) {
                            if (textExtraStruct.getStart() < 0) {
                                textExtraStruct.setStart(0);
                            }
                            if (textExtraStruct.getEnd() > desc.length()) {
                                textExtraStruct.setEnd(desc.length());
                            }
                        }
                    }
                    if (this.LL != null) {
                        Aweme aweme3 = this.LLIZLLLIL;
                        if (aweme3 != null && AwemeExtKt.isAdTraffic(aweme3)) {
                            i = 200;
                        } else {
                            i = 500;
                        }
                        c1355730lNr.setMaxSize(i);
                        c1355730lNr.setSpanSize(C341940Daq.LIZJ(15.0d));
                        c1355730lNr.setSpanColor(c1355730lNr.getCurrentTextColor());
                        c1355730lNr.setSpanStyle(1);
                        c1355730lNr.setOnSpanClickListener(new InterfaceC1355720lNq() { // from class: X.0SP4
                            /* JADX WARN: Removed duplicated region for block: B:174:0x03fe A[PHI: r1
                              0x03fe: PHI (r1v14 java.lang.String) = (r1v11 java.lang.String), (r1v15 java.lang.String) binds: [B:173:0x03fc, B:171:0x03f9] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Removed duplicated region for block: B:184:0x044f A[PHI: r1
                              0x044f: PHI (r1v16 java.lang.String) = (r1v9 java.lang.String), (r1v17 java.lang.String) binds: [B:166:0x03e9, B:164:0x03e6] A[DONT_GENERATE, DONT_INLINE]] */
                            @Override // X.InterfaceC1355720lNq
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LIZ(com.ss.android.ugc.aweme.model.TextExtraStruct r20) {
                                /*
                                    Method dump skipped, instruction units count: 1116
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C0SP4.LIZ(com.ss.android.ugc.aweme.model.TextExtraStruct):void");
                            }
                        });
                        c1355730lNr.LJJJJIZL(textExtra, null, null);
                        if (desc.length() > 0) {
                            Iterator<TextExtraStruct> it2 = textExtra.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    TextExtraStruct next = it2.next();
                                    if (LJIJ(next, desc) && next.getType() == 0 && (!TextUtils.isEmpty(next.getAwemeId()) || 2 == next.getSubtype())) {
                                        if (this.LLIZLLLIL.getDesc().charAt(next.getStart()) == '@') {
                                            C428830Grh c428830Grh = new C428830Grh(this.LL, C12ES.LJIIJ(r6) - (C12ES.LIZJ(100.0f, this.LL) + this.LL.getResources().getDimension(R.dimen.b40)), C960203pA.LIZ(R.attr.zj, this.LL), -1, next, false, null, false, false, null, 2016);
                                            c428830Grh.LLJILLL = C12ES.LIZJ(12.0f, this.LL);
                                            c428830Grh.LLJJ = C12ES.LIZJ(2.0f, this.LL);
                                            c428830Grh.LLJILJIL = C12ES.LIZJ(13.0f, this.LL);
                                            c1355730lNr.LJJJJI(next.getStart(), next.getEnd(), c428830Grh);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            if (C444960Hcc.LIZJ(this.LL)) {
                                if (C431080GvK.LIZ == null) {
                                    C431080GvK.LIZ = new C431080GvK();
                                }
                                c1355730lNr.setMovementMethod(C431080GvK.LIZ);
                            } else {
                                c1355730lNr.setMovementMethod(C431060GvI.LIZ());
                            }
                        } catch (IndexOutOfBoundsException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C2344809Gs.LIZ(e);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            View view = this.LLILLL;
            if (view != null) {
                C786410Ut5.I7(new ACListenerS146S0100000_11(this, 83), view);
            }
        }
    }

    public final boolean LJIJ(TextExtraStruct textExtraStruct, String str) {
        if (str != null && textExtraStruct.getStart() >= 0 && textExtraStruct.getEnd() >= 0 && textExtraStruct.getEnd() <= str.length() && textExtraStruct.getStart() < str.length() && textExtraStruct.getStart() < textExtraStruct.getEnd()) {
            return true;
        }
        return false;
    }
}
