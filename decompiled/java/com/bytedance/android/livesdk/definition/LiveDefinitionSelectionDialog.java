package com.bytedance.android.livesdk.definition;

import X.C0IJT;
import X.C0IL2;
import X.C0IMN;
import X.C0IN9;
import X.C0INE;
import X.C0INF;
import X.C0INJ;
import X.C0INK;
import X.C0TZM;
import X.C1161920gLG;
import X.C15438062q;
import X.C16F5;
import X.C1954807lC;
import X.C354201Zc;
import X.C474500IjA;
import X.C491701vn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500950Jkj;
import X.C751340Tdc;
import X.C786410Ut5;
import X.InterfaceC1118490fDD;
import X.InterfaceC480510Isr;
import Y.ACListenerS142S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.GameLiveAbrNewResolution;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.GameLiveVideoQualityOptV2EnableSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveDefinitionSelectionDialog extends LiveDialogFragment implements C0INJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LCAqICE6HELIOSPCwjJ2EfITMpDSo1ISslPSY8JhYpJSowPCwjJws6KSkjLg==";
    public RecyclerView LL;
    public C16F5 LLILLJJLI;
    public ImageView LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public Space LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public C0INK LLJ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean adaptEdgeToEdge() {
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C500980Jkm createParams() {
        /*
            r6 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.dataChannel
            r2 = 1
            if (r1 == 0) goto L47
            java.lang.Class<X.0TZM> r0 = X.C0TZM.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L47
            boolean r1 = r0.booleanValue()
            if (r1 != 0) goto L48
            r5 = 2131887755(0x7f12068b, float:1.9410126E38)
        L18:
            boolean r0 = X.C497740JfY.LJJ()
            if (r0 == 0) goto L45
            r4 = 3
        L1f:
            r3 = -1
            if (r1 != r2) goto L39
            r2 = -1
            r3 = -2
            r0 = 2131567565(0x7f0d23cd, float:1.8760704E38)
        L27:
            X.0Jkm r1 = new X.0Jkm
            r1.<init>(r0)
            r1.LIZJ = r5
            r0 = 48
            r1.LJIILIIL = r0
            r1.LJII = r4
            r1.LJIIIZ = r2
            r1.LJIIJ = r3
            return r1
        L39:
            r0 = 1136361472(0x43bb8000, float:375.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r2 = (int) r0
            r0 = 2131567568(0x7f0d23d0, float:1.876071E38)
            goto L27
        L45:
            r4 = 5
            goto L1f
        L47:
            r1 = 1
        L48:
            r5 = 2131887753(0x7f120689, float:1.9410122E38)
            if (r1 != r2) goto L50
            r4 = 80
            goto L1f
        L50:
            if (r1 == 0) goto L18
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.definition.LiveDefinitionSelectionDialog.createParams():X.0Jkm");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC1118490fDD genLandscapeDialogProxy() {
        return new C500950Jkj(R.layout.g5k);
    }

    @Override // X.C0INJ
    public final void e3() {
        dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean zBooleanValue;
        String string;
        String strLIZ;
        String str;
        String str2;
        DataChannel dataChannel;
        String currentResolution;
        LiveMode liveMode;
        Long l;
        Boolean bool;
        super.onCreate(bundle);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.gg0(C0TZM.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        DataChannel dataChannel3 = this.dataChannel;
        String str3 = "";
        if (dataChannel3 == null || (l = (Long) dataChannel3.gg0(C751340Tdc.class)) == null || (string = l.toString()) == null) {
            string = "";
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 == null || (liveMode = (LiveMode) dataChannel4.gg0(LiveModeChannel.class)) == null) {
            strLIZ = "";
        } else {
            strLIZ = C354201Zc.LIZ(liveMode);
        }
        if (zBooleanValue) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else if (!zBooleanValue) {
            str = "1";
        } else {
            throw new C1954807lC();
        }
        String str4 = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        if (str4 == null) {
            str4 = "";
        }
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str4);
        if (interfaceC480510IsrLIZIZ != null && (currentResolution = interfaceC480510IsrLIZIZ.getCurrentResolution()) != null) {
            str3 = currentResolution;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_definition_selection_page_show");
        c474500IjALIZ.LJJII(C491701vn.LIZ(), "anchor_id");
        c474500IjALIZ.LJJII(string, "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(C491701vn.LIZIZ()), "user_id");
        if (Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, str)) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        c474500IjALIZ.LJJII(str2, "room_orientation");
        c474500IjALIZ.LJJII(str3, "current_definition");
        c474500IjALIZ.LJJ(strLIZ);
        c474500IjALIZ.LIZ();
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.BQ2(this, LiveEndDismissDialogEvent.class, new AwS586S0100000_7(this, 97));
        }
        if (GameLiveVideoQualityOptV2EnableSetting.INSTANCE.enable() && (dataChannel = this.dataChannel) != null) {
            dataChannel.BQ2(this, GameLiveAbrNewResolution.class, new AwS586S0100000_7(this, 98));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zBooleanValue;
        Integer numValueOf;
        RecyclerView recyclerView;
        String currentResolution;
        Boolean bool;
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0TZM.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.LL = (RecyclerView) view.findViewById(R.id.yos);
        ImageView imageView = (ImageView) view.findViewById(R.id.yoq);
        this.LLILLL = imageView;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.you);
        this.LLILZ = (C16F5) view.findViewById(R.id.yot);
        this.LLILZIL = (C16F5) view.findViewById(R.id.yon);
        this.LLILZLL = (Space) view.findViewById(R.id.yop);
        this.LLIZ = view.findViewById(R.id.yor);
        this.LLIZLLLIL = view.findViewById(R.id.yoo);
        if (C0IN9.LIZ()) {
            C16F5 c16f5 = this.LLILZ;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 0);
            }
            C16F5 c16f52 = this.LLILZIL;
            if (c16f52 != null) {
                C786410Ut5.LLJJJJ(c16f52, 0);
            }
            Space space = this.LLILZLL;
            if (space != null) {
                C786410Ut5.LLIIZ(space, 0);
            }
            View view2 = this.LLIZLLLIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            C16F5 c16f53 = this.LLILLJJLI;
            if (c16f53 != null) {
                ViewGroup.LayoutParams layoutParams = c16f53.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -1;
                }
                ViewGroup.LayoutParams layoutParams2 = c16f53.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -2;
                }
                c16f53.requestLayout();
                c16f53.invalidate();
            }
            C16F5 c16f54 = this.LLILLJJLI;
            if (c16f54 != null) {
                C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(8.0f), c16f54);
            }
            View view3 = this.LLIZ;
            if (view3 != null) {
                C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(9.0f), view3);
            }
        } else {
            C16F5 c16f55 = this.LLILZ;
            if (c16f55 != null) {
                C786410Ut5.LLJJJJ(c16f55, 8);
            }
            C16F5 c16f56 = this.LLILZIL;
            if (c16f56 != null) {
                C786410Ut5.LLJJJJ(c16f56, 8);
            }
            Space space2 = this.LLILZLL;
            if (space2 != null) {
                C786410Ut5.LLIIZ(space2, 8);
            }
            View view4 = this.LLIZLLLIL;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
            C16F5 c16f57 = this.LLILLJJLI;
            if (c16f57 != null) {
                ViewGroup.LayoutParams layoutParams3 = c16f57.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = -1;
                }
                ViewGroup.LayoutParams layoutParams4 = c16f57.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.height = (int) C497740JfY.LIZIZ(52.0f);
                }
                c16f57.requestLayout();
                c16f57.invalidate();
            }
            C16F5 c16f58 = this.LLILLJJLI;
            if (c16f58 != null) {
                C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(0.0f), c16f58);
            }
            View view5 = this.LLIZ;
            if (view5 != null) {
                C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(0.0f), view5);
            }
        }
        String str = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str);
        if (interfaceC480510IsrLIZIZ != null && (currentResolution = interfaceC480510IsrLIZIZ.getCurrentResolution()) != null) {
            str2 = currentResolution;
        }
        ImageView imageView2 = this.LLILLL;
        if (imageView2 != null) {
            C786410Ut5.Q7(imageView2, new ACListenerS142S0100000_7(this, 50));
        }
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 51), view);
        RecyclerView recyclerView2 = this.LL;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        }
        List<C0INF> listLIZ = C0INE.LIZ(this.dataChannel);
        if (C500260Jjc.LJJIIZ(str2)) {
            Map<String, String> map = C0IMN.LIZLLL;
            if (map.containsKey(str2)) {
                Object obj = ((LinkedHashMap) map).get(str2);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
                for (C0INF c0inf : listLIZ) {
                    if (Intrinsics.LJFF(c0inf.LIZIZ, str2)) {
                        obj = c0inf.LIZ;
                    }
                    arrayList.add(Unit.LIZ);
                }
                C16F5 c16f59 = this.LLILZ;
                if (c16f59 != null) {
                    c16f59.setText(C497740JfY.LJIJJ(2131853641, obj));
                }
            }
        }
        C0INK c0ink = new C0INK(this.LL, listLIZ, zBooleanValue, this.dataChannel, this);
        this.LLJ = c0ink;
        RecyclerView recyclerView3 = this.LL;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(c0ink);
        }
        C0INK c0ink2 = this.LLJ;
        if (c0ink2 != null && (numValueOf = Integer.valueOf(c0ink2.LLILZLL)) != null && (recyclerView = this.LL) != null) {
            recyclerView.scrollToPosition(numValueOf.intValue());
        }
    }
}
