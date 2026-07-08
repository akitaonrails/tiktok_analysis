package com.bytedance.android.livesdk.adminsetting;

import X.C01C5;
import X.C01GW;
import X.C0IJT;
import X.C0TZ7;
import X.C0UX6;
import X.C1119170fEJ;
import X.C1548820qPI;
import X.C16F5;
import X.C16FZ;
import X.C1911200zpm;
import X.C20736316Cj;
import X.C20743716Ff;
import X.C23250099c;
import X.C292401Bi;
import X.C439101nJ;
import X.C452501pT;
import X.C474500IjA;
import X.C475510Ikn;
import X.C488020JBw;
import X.C497740JfY;
import X.C500260Jjc;
import X.C751060TdA;
import X.C751280TdW;
import X.C755070Tjd;
import X.C758170Tod;
import X.C785990UsP;
import X.C786220Usm;
import X.C786410Ut5;
import X.InterfaceC1106030et7;
import X.ViewOnClickListenerC751210TdP;
import Y.ACListenerS147S0100000_12;
import Y.ACListenerS72S0110000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS694S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveCommentSettingFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTHELIOSE4ICE0ZgklPyoQJyghLCEnGyA4PSY9LwM+KCg+LSs4Gic2LTE=";
    public C16FZ LLJLLL;
    public LinearLayout LLJZ;
    public C16F5 LLJZIJLIL;
    public LinearLayout LLL;
    public C16F5 LLLF;
    public C20743716Ff LLLFF;
    public C20743716Ff LLLFFI;
    public View LLLFZ;
    public C20743716Ff LLLI;
    public LinearLayout LLLII;
    public LinearLayout LLLIIII;
    public LinearLayout LLLIIIIL;
    public View LLLIIIL;
    public View LLLIIL;
    public C16F5 LLLIILIL;
    public LinearLayout LLLIL;
    public LinearLayout LLLILZ;
    public View LLLILZJ;
    public Function1<? super Boolean, Unit> LLLL;
    public String LLLLII;
    public final C01GW LLLILZLLLI = C292401Bi.LIZ(new AwS556S0100000_12(this, 121));
    public final C01GW LLLIZZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 119));
    public final C01GW LLLJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 120));
    public final C01GW LLLJIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 118));
    public final C01GW LLLJL = C292401Bi.LIZ(new AwS556S0100000_12(this, 122));
    public final C785990UsP LLLLIIIILLL = new C785990UsP(this, 11);
    public final C786220Usm LLLLIIL = new C786220Usm(this, 1);

    public final View BS() {
        View viewFindViewById = this.LLLIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vxn) : null;
            this.LLLIIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final boolean ES() {
        return ((Boolean) this.LLLJIL.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131842704));
        if (!Intrinsics.LJFF(this.LLLLII, "click_msg") && !Intrinsics.LJFF(this.LLLLII, "long_press_msg") && !Intrinsics.LJFF(this.LLLLII, "community_flag_filter")) {
            ArrayList arrayList = new ArrayList();
            C758170Tod c758170TodVR = VR();
            if (c758170TodVR != null) {
                arrayList.add(c758170TodVR);
            }
            c1119170fEJ.LJ = arrayList;
        }
        if (wS()) {
            c1119170fEJ.LJI = false;
        }
        return c1119170fEJ;
    }

    public final C16FZ getLoadingViewFromXml() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nnp) : null;
            this.LLJLLL = (C16FZ) viewFindViewById;
        }
        return (C16FZ) viewFindViewById;
    }

    public final Map uS() {
        HashMap map = new HashMap();
        Room roomYS = yS();
        map.put("room_id", String.valueOf(roomYS != null ? roomYS.getId() : 0L));
        map.put("type", "global_default_on");
        map.put("from_status", InterfaceC1106030et7.J5.LIZIZ().booleanValue() ? "on" : "off");
        map.put("position", "panel");
        return map;
    }

    public final boolean wS() {
        return ((Boolean) this.LLLJ.getValue()).booleanValue();
    }

    public final Room yS() {
        return (Room) this.LLLILZLLLI.getValue();
    }

    public final C751280TdW zS() {
        return (C751280TdW) this.LLLJL.getValue();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C751280TdW c751280TdWZS = zS();
        c751280TdWZS.getClass();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.zQ2(c751280TdWZS);
        dataChannelGlobal.zQ2(this);
        C1548820qPI.LJIIIIZZ("star_comment_setting_event", this.LLLLIIL);
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
        this.LLLF = null;
        this.LLLFF = null;
        this.LLLFFI = null;
        this.LLLFZ = null;
        this.LLLI = null;
        this.LLLII = null;
        this.LLLIIII = null;
        this.LLLIIIIL = null;
        this.LLLIIIL = null;
        this.LLLIIL = null;
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZ = null;
        this.LLLILZJ = null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        if (wS()) {
            return C20736316Cj.LIZIZ(R.attr.exw, context);
        }
        return C1911200zpm.LIZ(context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        int i;
        SheetOptions sheetOptions = new SheetOptions();
        if (wS()) {
            i = 1;
        } else {
            i = 2;
        }
        sheetOptions.LIZ(i, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Room roomYS;
        StarCommentConfig starCommentConfig;
        Room roomYS2;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus.StarCommentPermissionSwitch starCommentPermissionSwitch;
        String strLJIJI;
        float f;
        View viewBS;
        DataChannel dataChannelLJ;
        RoomCreateInfo roomCreateInfo;
        DataChannel dataChannelLJ2;
        RoomCreateInfo roomCreateInfo2;
        Drawable drawable;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view, bundle);
        C500260Jjc.LLFFF(getLoadingViewFromXml());
        View viewFindViewById = null;
        if (C755070Tjd.LIZ(ES())) {
            View viewFindViewById2 = this.LLJZIJLIL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.yip);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJZIJLIL = (C16F5) viewFindViewById2;
            }
            ((TextView) viewFindViewById2).setText(getString(2131841262));
        } else {
            View viewFindViewById3 = this.LLJZ;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.bez);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJZ = (LinearLayout) viewFindViewById3;
            }
            C786410Ut5.LJZL(8, (LinearLayout) viewFindViewById3);
        }
        boolean z = false;
        if (wS()) {
            View viewFindViewById4 = this.LLL;
            if (viewFindViewById4 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.eda);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLL = (LinearLayout) viewFindViewById4;
            }
            ViewGroup.LayoutParams layoutParams = viewFindViewById4.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.height = -2;
                marginLayoutParams.setMarginStart(C439101nJ.LIZ(12));
                marginLayoutParams.setMarginEnd(C439101nJ.LIZ(12));
                marginLayoutParams.topMargin = C439101nJ.LIZ(8);
                marginLayoutParams.bottomMargin = C439101nJ.LIZ(8);
            }
            View viewFindViewById5 = this.LLL;
            if (viewFindViewById5 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById5 = view5.findViewById(R.id.eda);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLL = (LinearLayout) viewFindViewById5;
            }
            Context context = getContext();
            if (context != null) {
                drawable = context.getDrawable(R.drawable.e74);
            } else {
                drawable = null;
            }
            viewFindViewById5.setBackground(drawable);
            View viewFindViewById6 = this.LLLF;
            if (viewFindViewById6 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById6 = view6.findViewById(R.id.wh);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLLF = (C16F5) viewFindViewById6;
            }
            C786410Ut5.LLJJJJ((C16F5) viewFindViewById6, 0);
        }
        View viewFindViewById7 = this.LLLFF;
        if (viewFindViewById7 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById7 = view7.findViewById(R.id.bey);
            } else {
                viewFindViewById7 = null;
            }
            this.LLLFF = (C20743716Ff) viewFindViewById7;
        }
        C20743716Ff c20743716Ff = (C20743716Ff) viewFindViewById7;
        c20743716Ff.setChecked(InterfaceC1106030et7.J5.LIZIZ().booleanValue());
        if (yS() != null && C755070Tjd.LIZ(ES())) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_translation_show");
            c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
            c474500IjALIZ.LJJIIZI(uS());
            c474500IjALIZ.LIZ();
        }
        C786410Ut5.A7(c20743716Ff, new C785990UsP(this, 12));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C751060TdA(this, null), 3);
        View viewFindViewById8 = this.LLLII;
        if (viewFindViewById8 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById8 = view8.findViewById(R.id.c3i);
            } else {
                viewFindViewById8 = null;
            }
            this.LLLII = (LinearLayout) viewFindViewById8;
        }
        C786410Ut5.I7(new AbS694S0100000_12(this, 6), viewFindViewById8);
        View viewFindViewById9 = this.LLLIIII;
        if (viewFindViewById9 == null) {
            View view9 = getView();
            if (view9 != null) {
                viewFindViewById9 = view9.findViewById(R.id.xix);
            } else {
                viewFindViewById9 = null;
            }
            this.LLLIIII = (LinearLayout) viewFindViewById9;
        }
        C786410Ut5.I7(new AbS694S0100000_12(this, 7), viewFindViewById9);
        View viewFindViewById10 = this.LLLIIIIL;
        if (viewFindViewById10 == null) {
            View view10 = getView();
            if (view10 != null) {
                viewFindViewById10 = view10.findViewById(R.id.hxh);
            } else {
                viewFindViewById10 = null;
            }
            this.LLLIIIIL = (LinearLayout) viewFindViewById10;
        }
        C786410Ut5.I7(new AbS694S0100000_12(this, 8), viewFindViewById10);
        if (!Intrinsics.LJFF(this.LLLLII, "from_page_preview") ? !((roomYS = yS()) == null || (starCommentConfig = roomYS.starCommentConfig) == null || !starCommentConfig.starCommentQualification || (roomYS2 = yS()) == null || (roomAuthStatus = roomYS2.getRoomAuthStatus()) == null || (starCommentPermissionSwitch = roomAuthStatus.starCommentPermissionSwitch) == null || starCommentPermissionSwitch.status != 2) : !((dataChannelLJ = C475510Ikn.LJ(this)) == null || (roomCreateInfo = (RoomCreateInfo) dataChannelLJ.gg0(RoomCreateInfoChannel.class)) == null || !roomCreateInfo.anchorStarCommentPermission || (dataChannelLJ2 = C475510Ikn.LJ(this)) == null || (roomCreateInfo2 = (RoomCreateInfo) dataChannelLJ2.gg0(RoomCreateInfoChannel.class)) == null || roomCreateInfo2.starCommentPermissionSwitch)) {
            z = true;
        }
        if (zS().LIZJ() && !z && !Intrinsics.LJFF(InterfaceC1106030et7.D4.LIZIZ().get("2"), Boolean.FALSE) && (viewBS = BS()) != null) {
            C500260Jjc.LLFFF(viewBS);
        }
        View viewFindViewById11 = this.LLLIILIL;
        if (viewFindViewById11 == null) {
            View view11 = getView();
            if (view11 != null) {
                viewFindViewById11 = view11.findViewById(R.id.c3m);
            } else {
                viewFindViewById11 = null;
            }
            this.LLLIILIL = (C16F5) viewFindViewById11;
        }
        TextView textView = (TextView) viewFindViewById11;
        C0TZ7 c0tz7 = C0TZ7.LIZ;
        DataChannel dataChannelLJ3 = C475510Ikn.LJ(this);
        c0tz7.getClass();
        if (C0TZ7.LIZIZ(dataChannelLJ3)) {
            strLJIJI = C497740JfY.LJIJI(2131835607);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131842673);
        }
        textView.setText(strLJIJI);
        View viewFindViewById12 = this.LLLIL;
        if (viewFindViewById12 == null) {
            View view12 = getView();
            if (view12 != null) {
                viewFindViewById12 = view12.findViewById(R.id.vxg);
            } else {
                viewFindViewById12 = null;
            }
            this.LLLIL = (LinearLayout) viewFindViewById12;
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById12;
        if (z) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.W4(linearLayout, f);
        View viewFindViewById13 = this.LLLIL;
        if (viewFindViewById13 == null) {
            View view13 = getView();
            if (view13 != null) {
                viewFindViewById13 = view13.findViewById(R.id.vxg);
            } else {
                viewFindViewById13 = null;
            }
            this.LLLIL = (LinearLayout) viewFindViewById13;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById13, new ViewOnClickListenerC751210TdP(new ACListenerS72S0110000_12(this, z, 3)));
        if (wS()) {
            View viewFindViewById14 = this.LLLILZ;
            if (viewFindViewById14 == null) {
                View view14 = getView();
                if (view14 != null) {
                    viewFindViewById14 = view14.findViewById(R.id.oyd);
                } else {
                    viewFindViewById14 = null;
                }
                this.LLLILZ = (LinearLayout) viewFindViewById14;
            }
            C786410Ut5.R7((LinearLayout) viewFindViewById14, new ACListenerS147S0100000_12(this, 93));
            C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_PREVIEW_MUTE_RULE;
            View viewFindViewById15 = this.LLLILZJ;
            if (viewFindViewById15 == null) {
                View view15 = getView();
                if (view15 != null) {
                    viewFindViewById15 = view15.findViewById(R.id.xiz);
                } else {
                    viewFindViewById15 = null;
                }
                this.LLLILZJ = viewFindViewById15;
            }
            RedDotExtensionKt.LJI(viewFindViewById15, this, null, c0ux6, null);
        }
        C1548820qPI.LIZLLL("star_comment_setting_event", this.LLLLIIL);
        C0UX6 c0ux62 = C0UX6.LIVE_BROADCAST_PREVIEW_FILTER_COMMENT;
        View view16 = this.LLLIIIL;
        if (view16 == null) {
            View view17 = getView();
            if (view17 != null) {
                viewFindViewById = view17.findViewById(R.id.hxi);
            }
            this.LLLIIIL = viewFindViewById;
        } else {
            viewFindViewById = view16;
        }
        RedDotExtensionKt.LJI(viewFindViewById, this, null, c0ux62, null);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        int i;
        if (ES() || (C01C5.LIZ(C475510Ikn.LJ(this)) && C488020JBw.LIZ(yS()))) {
            z = true;
        } else {
            z = false;
        }
        if (!wS() && !z) {
            i = R.layout.gal;
        } else {
            i = R.layout.gam;
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }
}
