package com.bytedance.android.livesdk.programmedlive.ui;

import X.C00A0;
import X.C01GW;
import X.C0IJT;
import X.C1161920gLG;
import X.C12ES;
import X.C1308910kAL;
import X.C1954807lC;
import X.C19ME;
import X.C20441214yg;
import X.C21569419bA;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C444890HcV;
import X.C452501pT;
import X.C474500IjA;
import X.C476010Ilb;
import X.C476030Ild;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C938200aWQ;
import X.EnumC476020Ilc;
import X.EnumC476080Ili;
import X.ViewOnLayoutChangeListenerC521690Kd5;
import Y.ACListenerS111S0200000_7;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS26S0110000_7;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.CoHostAndMultiGuestSceneGiftPanelChangeChannel;
import com.bytedance.android.livesdk.dataChannel.CastersWidgetVisibleChannel;
import com.bytedance.android.livesdk.dataChannel.InteractiveTopBarShowChannel;
import com.bytedance.android.livesdk.dataChannel.MultiTabCurrentIndex;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.programmedlive.ui.InteractiveTopBarWidget;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTab;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class InteractiveTopBarWidget extends LiveRecyclableWidget {
    public Room LL;
    public Boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final List<CustomTab> LLILLJJLI = new ArrayList();
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 90));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 92));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 91));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 93));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 89));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 84));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 87));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 88));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 86));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 85));
    public EnumC476020Ilc LLJJI = EnumC476020Ilc.NONE;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(87));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hzt;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final ViewGroup A1() {
        return (ViewGroup) this.LLIZ.getValue();
    }

    public final View B1() {
        return (View) this.LLJ.getValue();
    }

    public final void C1() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view;
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        final boolean z = this.LLJJIJI;
        this.LLJJIJI = true;
        int i = C476030Ild.LIZ[this.LLJJI.ordinal()];
        ViewGroup.MarginLayoutParams marginLayoutParams3 = null;
        if (i == 1) {
            ViewGroup viewGroupA1 = A1();
            if (viewGroupA1 != null) {
                C500260Jjc.LLFFF(viewGroupA1);
            }
            ViewGroup viewGroupX1 = x1();
            if (viewGroupX1 != null) {
                C500260Jjc.LJIILLIIL(viewGroupX1);
            }
            View viewB1 = B1();
            if (viewB1 != null) {
                C500260Jjc.LJIILIIL(viewB1);
            }
            View view3 = (View) this.LLJIJIL.getValue();
            if (view3 != null) {
                C500260Jjc.LLFFF(view3);
            }
            View view4 = (View) this.LLJJ.getValue();
            if (view4 != null) {
                C500260Jjc.LJIILIIL(view4);
            }
            ViewGroup viewGroupX12 = x1();
            if (viewGroupX12 != null) {
                ViewGroup viewGroupX13 = x1();
                ViewGroup.LayoutParams layoutParams = viewGroupX13 != null ? viewGroupX13.getLayoutParams() : null;
                if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.width = -2;
                    marginLayoutParams3 = marginLayoutParams;
                }
                C786410Ut5.X5(marginLayoutParams3, viewGroupX12);
            }
            D1();
        } else if (i == 2) {
            ViewGroup viewGroupA12 = A1();
            if (viewGroupA12 != null) {
                C500260Jjc.LJIILIIL(viewGroupA12);
            }
            ViewGroup viewGroupX14 = x1();
            if (viewGroupX14 != null) {
                C500260Jjc.LLFFF(viewGroupX14);
            }
            View viewB12 = B1();
            if (viewB12 != null) {
                C500260Jjc.LLFFF(viewB12);
            }
            View view5 = (View) this.LLJIJIL.getValue();
            if (view5 != null) {
                C500260Jjc.LJIILIIL(view5);
            }
            View view6 = (View) this.LLJJ.getValue();
            if (view6 != null) {
                C500260Jjc.LLFFF(view6);
            }
            ViewGroup viewGroupX15 = x1();
            if (viewGroupX15 != null) {
                ViewGroup viewGroupX16 = x1();
                ViewGroup.LayoutParams layoutParams2 = viewGroupX16 != null ? viewGroupX16.getLayoutParams() : null;
                if ((layoutParams2 instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams2.width = 0;
                    marginLayoutParams3 = marginLayoutParams2;
                }
                C786410Ut5.X5(marginLayoutParams3, viewGroupX15);
            }
            D1();
        } else if (i == 3) {
            ViewGroup viewGroupA13 = A1();
            if (viewGroupA13 != null) {
                C500260Jjc.LLFFF(viewGroupA13);
            }
            ViewGroup viewGroupX17 = x1();
            if (viewGroupX17 != null) {
                C500260Jjc.LJIILIIL(viewGroupX17);
            }
            View viewB13 = B1();
            if (viewB13 != null) {
                C500260Jjc.LJIILIIL(viewB13);
            }
        } else {
            if (i != 4) {
                throw new C1954807lC();
            }
            ViewGroup viewGroupA14 = A1();
            if (viewGroupA14 != null) {
                C500260Jjc.LJIILIIL(viewGroupA14);
            }
            ViewGroup viewGroupX18 = x1();
            if (viewGroupX18 != null) {
                C500260Jjc.LJIILIIL(viewGroupX18);
            }
            View viewB14 = B1();
            if (viewB14 != null) {
                C500260Jjc.LJIILIIL(viewB14);
            }
        }
        if (this.LLJJI == EnumC476020Ilc.BOTH_MULTITAB_AND_CASTERS && (view2 = getView()) != null) {
            view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0Ilf
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view7, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    Integer numValueOf;
                    view7.removeOnLayoutChangeListener(this);
                    InteractiveTopBarWidget interactiveTopBarWidget = this.LL;
                    ViewGroup viewGroupA15 = interactiveTopBarWidget.A1();
                    if (viewGroupA15 != null) {
                        numValueOf = Integer.valueOf(viewGroupA15.getWidth());
                    } else {
                        numValueOf = null;
                    }
                    interactiveTopBarWidget.H1(z, numValueOf);
                    ViewGroup viewGroupA16 = this.LL.A1();
                    if (viewGroupA16 != null) {
                        C500260Jjc.LLFFF(viewGroupA16);
                    }
                    ViewGroup viewGroupX19 = this.LL.x1();
                    if (viewGroupX19 != null) {
                        C500260Jjc.LLFFF(viewGroupX19);
                    }
                    View viewB15 = this.LL.B1();
                    if (viewB15 != null) {
                        C500260Jjc.LLFFF(viewB15);
                    }
                }
            });
        }
        if (this.LLJJI != EnumC476020Ilc.MULTITAB || (view = getView()) == null) {
            return;
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0Ilg
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view7, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                Integer numValueOf;
                view7.removeOnLayoutChangeListener(this);
                InteractiveTopBarWidget interactiveTopBarWidget = this.LL;
                ViewGroup viewGroupA15 = interactiveTopBarWidget.A1();
                if (viewGroupA15 != null) {
                    numValueOf = Integer.valueOf(viewGroupA15.getWidth());
                } else {
                    numValueOf = null;
                }
                interactiveTopBarWidget.H1(z, numValueOf);
                View viewB15 = this.LL.B1();
                if (viewB15 != null) {
                    C500260Jjc.LLFFF(viewB15);
                }
            }
        });
    }

    public final void D1() {
        TextView textView = (TextView) this.LLJILLL.getValue();
        if (textView != null) {
            textView.setText(C497740JfY.LJIJI(2131852035));
        }
        ViewGroup viewGroupX1 = x1();
        if (viewGroupX1 != null) {
            C786410Ut5.K7(viewGroupX1, new ACListenerS142S0100000_7(this, 94));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_program_casters_link_anchor_list");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("show", "action_type");
        c474500IjALIZ.LJJII("Casters", "page_tag");
        c474500IjALIZ.LJJII("collapse", "list_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        C20441214yg.LJIIIZ("InteractiveTopBarWidget", "hide");
        E1(false);
        super.hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            F1(0);
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(InteractiveTopBarShowChannel.class, Boolean.FALSE);
            }
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            Boolean bool = Boolean.FALSE;
            dataChannel2.zW(CastersWidgetVisibleChannel.class, new Pair(bool, bool));
        }
        C21569419bA c21569419bA = (C21569419bA) this.LLJILJIL.getValue();
        if (c21569419bA != null) {
            c21569419bA.LJ();
        }
        this.LLILLL = Boolean.FALSE;
        this.LLILZIL = false;
        this.LLILZ = false;
        this.LLJJIII = false;
        this.LLJJIJI = false;
    }

    public final ViewGroup x1() {
        return (ViewGroup) this.LLJI.getValue();
    }

    public final EnumC476020Ilc y1() {
        Room room;
        EnumC476020Ilc enumC476020IlcLIZ;
        DataChannel dataChannel = this.dataChannel;
        return (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null || (enumC476020IlcLIZ = C476010Ilb.LIZ(room)) == null) ? EnumC476020Ilc.NONE : enumC476020IlcLIZ;
    }

    public final LinearLayout z1() {
        return (LinearLayout) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show hasFirstFrameDone = ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", hasDetectHorizontalVideo = ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isVideoHorizontal = ");
        sbLIZ.append(this.LLILLL);
        C20441214yg.LJIIIZ("InteractiveTopBarWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILZIL && this.LLILZ) {
            super.show();
            C1();
            View view = getView();
            if (view != null) {
                view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC521690Kd5(this, 2));
            }
        }
    }

    public final void E1(boolean z) {
        EnumC476080Ili enumC476080Ili;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(InteractiveTopBarShowChannel.class, Boolean.valueOf(z));
        }
        if (z) {
            enumC476080Ili = EnumC476080Ili.SMALL_TRAY_ON_PUBLIC_SCREEN;
        } else {
            enumC476080Ili = EnumC476080Ili.NORMAL_TRAY;
        }
        int value = enumC476080Ili.getValue();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zW(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class, new C938200aWQ(value, 100));
        }
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS26S0110000_7(this, z, 1));
        }
    }

    public final void F1(int i) {
        View childAt;
        Integer numLIZJ;
        boolean z;
        LinearLayout linearLayoutZ1 = z1();
        if (linearLayoutZ1 != null) {
            int childCount = linearLayoutZ1.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                LinearLayout linearLayoutZ12 = z1();
                if (linearLayoutZ12 != null && (childAt = linearLayoutZ12.getChildAt(i2)) != null) {
                    if (i2 == i) {
                        numLIZJ = C1308910kAL.LIZJ(R.attr.ezq, (Context) this.LLILZLL.getValue());
                    } else {
                        numLIZJ = C1308910kAL.LIZJ(R.attr.ezt, (Context) this.LLILZLL.getValue());
                    }
                    if (numLIZJ != null) {
                        ((TextView) childAt.findViewById(R.id.title)).setTextColor(numLIZJ.intValue());
                    }
                    View viewFindViewById = childAt.findViewById(R.id.wwr);
                    if (i2 == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C500260Jjc.LJLJLJ(viewFindViewById, z);
                }
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(MultiTabCurrentIndex.class, Integer.valueOf(i));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            Boolean bool = Boolean.FALSE;
            dataChannel2.zW(CastersWidgetVisibleChannel.class, new Pair(bool, bool));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(java.lang.Object[] r5) {
        /*
            r4 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto La1
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto La1
            r4.LL = r0
            com.bytedance.android.livesdkapi.depend.model.live.LiveChain r0 = r0.liveChainInfo
            if (r0 == 0) goto La5
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.CoStreamer> r0 = r0.coStreamers
            if (r0 == 0) goto La5
            boolean r0 = r0.isEmpty()
            r3 = 1
            r0 = r0 ^ 1
            if (r0 != r3) goto La5
        L21:
            r4.LLJJIII = r3
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r4.dataChannel
            if (r2 == 0) goto L30
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.InteractiveTopBarHasCasterChannel> r1 = com.bytedance.android.livesdk.dataChannel.InteractiveTopBarHasCasterChannel.class
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.zW(r1, r0)
        L30:
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r4.dataChannel
            if (r3 == 0) goto L40
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.CastersWidgetVisibleChannel> r2 = com.bytedance.android.livesdk.dataChannel.CastersWidgetVisibleChannel.class
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.<init>(r0, r0)
            r3.zW(r2, r1)
        L40:
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.CustomTab> r0 = r4.LLILLJJLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.CustomTab> r1 = r4.LLILLJJLI
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LL
            if (r0 == 0) goto La2
            java.util.List r0 = X.C088100Ut.LIZ(r0)
            if (r0 == 0) goto La2
        L53:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.addAll(r0)
            X.0Ilc r0 = r4.y1()
            r4.LLJJI = r0
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r4.dataChannel
            if (r3 == 0) goto L6e
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.InteractiveTopBarHasCasterChannel> r2 = com.bytedance.android.livesdk.dataChannel.InteractiveTopBarHasCasterChannel.class
            kotlin.jvm.internal.AwS586S0100000_7 r1 = new kotlin.jvm.internal.AwS586S0100000_7
            r0 = 178(0xb2, float:2.5E-43)
            r1.<init>(r4, r0)
            r3.EQ2(r4, r2, r1)
        L6e:
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r4.dataChannel
            if (r3 == 0) goto L7e
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.FirstFrameChannelEvent> r2 = com.bytedance.android.livesdk.dataChannel.FirstFrameChannelEvent.class
            kotlin.jvm.internal.AwS586S0100000_7 r1 = new kotlin.jvm.internal.AwS586S0100000_7
            r0 = 179(0xb3, float:2.51E-43)
            r1.<init>(r4, r0)
            r3.EQ2(r4, r2, r1)
        L7e:
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r4.dataChannel
            if (r3 == 0) goto L8e
            java.lang.Class<com.bytedance.android.live.room.VideoOrientationChangeChannel> r2 = com.bytedance.android.live.room.VideoOrientationChangeChannel.class
            kotlin.jvm.internal.AwS586S0100000_7 r1 = new kotlin.jvm.internal.AwS586S0100000_7
            r0 = 180(0xb4, float:2.52E-43)
            r1.<init>(r4, r0)
            r3.EQ2(r4, r2, r1)
        L8e:
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r4.dataChannel
            if (r3 == 0) goto L9e
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.CastersWidgetVisibleChannel> r2 = com.bytedance.android.livesdk.dataChannel.CastersWidgetVisibleChannel.class
            kotlin.jvm.internal.AwS586S0100000_7 r1 = new kotlin.jvm.internal.AwS586S0100000_7
            r0 = 181(0xb5, float:2.54E-43)
            r1.<init>(r4, r0)
            r3.EQ2(r4, r2, r1)
        L9e:
            r4.hide()
        La1:
            return
        La2:
            X.13BV r0 = X.C13BV.INSTANCE
            goto L53
        La5:
            r3 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.programmedlive.ui.InteractiveTopBarWidget.onLoad(java.lang.Object[]):void");
    }

    public final void H1(boolean z, Integer num) {
        C00A0 c00a0;
        Integer num2;
        Integer numValueOf;
        Long lValueOf;
        if (num != null) {
            num.intValue();
            LinearLayout linearLayoutZ1 = z1();
            if (linearLayoutZ1 != null) {
                C786410Ut5.LJJJJJL(linearLayoutZ1);
            }
            if (num.intValue() == 0 || ((ArrayList) this.LLILLJJLI).isEmpty()) {
                return;
            }
            List<CustomTab> list = this.LLILLJJLI;
            num.intValue();
            C444890HcV c444890HcV = new C444890HcV();
            c444890HcV.LIZ(42);
            ArrayList arrayList = (ArrayList) list;
            int iIntValue = (num.intValue() - ((int) C12ES.LIZJ(40.0f, this.context))) / arrayList.size();
            Iterator it2 = arrayList.iterator();
            int iIntValue2 = 0;
            float f = 0.0f;
            boolean z2 = false;
            while (it2.hasNext()) {
                float fMeasureText = c444890HcV.measureText(((CustomTab) it2.next()).tabTitle) + C418440Gaw.LIZIZ(24);
                f += fMeasureText;
                if (fMeasureText > iIntValue) {
                    z2 = true;
                }
            }
            if (f < num.intValue() && !z2) {
                c00a0 = C00A0.AVERAGE_DIVIDE;
            } else {
                c00a0 = C00A0.SELF_WIDTH;
            }
            for (CustomTab customTab : (ArrayList) this.LLILLJJLI) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne((Context) this.LLILZLL.getValue()), R.layout.i2v, z1(), false);
                TextView textView = (TextView) viewTd.findViewById(R.id.title);
                textView.setText(customTab.tabTitle);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                if (c00a0 == C00A0.AVERAGE_DIVIDE) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.getLayoutParams().width = -1;
                    ViewGroup viewGroupA1 = A1();
                    if (viewGroupA1 != null) {
                        viewGroupA1.setPadding(0, viewGroupA1.getPaddingTop(), 0, viewGroupA1.getPaddingBottom());
                    }
                } else {
                    textView.getLayoutParams().width = -2;
                    layoutParams.width = -2;
                    layoutParams.weight = 0.0f;
                }
                LinearLayout linearLayoutZ12 = z1();
                Long lValueOf2 = null;
                if (linearLayoutZ12 != null) {
                    numValueOf = Integer.valueOf(linearLayoutZ12.getChildCount());
                } else {
                    numValueOf = null;
                }
                LinearLayout linearLayoutZ13 = z1();
                if (linearLayoutZ13 != null) {
                    linearLayoutZ13.addView(viewTd, layoutParams);
                }
                if (z) {
                    DataChannel dataChannel = this.dataChannel;
                    String str = customTab.tabTitle;
                    String str2 = customTab.tabBizName;
                    Room room = (Room) dataChannel.gg0(RoomChannel.class);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_program_live_tab_show");
                    c474500IjALIZ.LJIJJLI(dataChannel);
                    if (room != null) {
                        lValueOf = Long.valueOf(room.getOwnerUserId());
                    } else {
                        lValueOf = null;
                    }
                    c474500IjALIZ.LJJII(lValueOf, "anchor_id");
                    if (room != null) {
                        lValueOf2 = Long.valueOf(room.getId());
                    }
                    c474500IjALIZ.LJJII(lValueOf2, "room_id");
                    c474500IjALIZ.LJJII(str, "tab_name");
                    c474500IjALIZ.LJJII(str2, "page_tag");
                    c474500IjALIZ.LIZ();
                }
                C786410Ut5.I7(new ACListenerS111S0200000_7(numValueOf, this, 76), viewTd);
            }
            EnumC476020Ilc enumC476020Ilc = this.LLJJI;
            if (enumC476020Ilc == EnumC476020Ilc.BOTH_MULTITAB_AND_CASTERS || enumC476020Ilc == EnumC476020Ilc.MULTITAB) {
                DataChannel dataChannel2 = this.dataChannel;
                if ((dataChannel2 == null || (num2 = (Integer) dataChannel2.gg0(MultiTabCurrentIndex.class)) == null || (iIntValue2 = num2.intValue()) >= 0) && iIntValue2 < ((ArrayList) this.LLILLJJLI).size()) {
                    F1(iIntValue2);
                }
            }
        }
    }

    public static void G1(InteractiveTopBarWidget interactiveTopBarWidget, LiveIconView liveIconView, float f) {
        interactiveTopBarWidget.getClass();
        liveIconView.animate().rotation(f).setDuration(300L).setInterpolator((Interpolator) interactiveTopBarWidget.LLJJIJIIJIL.getValue()).start();
    }
}
