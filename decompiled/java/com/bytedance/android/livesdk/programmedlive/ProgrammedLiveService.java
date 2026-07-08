package com.bytedance.android.livesdk.programmedlive;

import X.C01GW;
import X.C1161920gLG;
import X.C452501pT;
import X.C500260Jjc;
import X.C930940aKi;
import X.EnumC520290Kap;
import X.InterfaceC1090080eTO;
import X.InterfaceC1109090ey3;
import X.InterfaceC520300Kaq;
import Y.AObjectS60S0000000_7;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveChainEnableSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMultiTabDowngradeSetting;
import com.bytedance.android.livesdk.model.message.CommercialCustomMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.android.livesdk.programmedlive.pin.PLCusPinMsgViewModel;
import com.bytedance.android.livesdk.programmedlive.ui.CastersBackgroundWidget;
import com.bytedance.android.livesdk.programmedlive.ui.CastersWidget;
import com.bytedance.android.livesdk.programmedlive.ui.InteractiveTopBarWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveFollowCardWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceCollapseWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceLandscapeWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveTitleWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveUserInfoWidget;
import com.bytedance.android.livesdk.programmedlive.ui.XMultiTabContainerWidget;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTab;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTabInfo;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTabs;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes8.dex */
public class ProgrammedLiveService implements IProgrammedLiveService {
    public volatile boolean LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(84));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(83));

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final boolean Uv2() {
        return LiveChainEnableSetting.INSTANCE.enable();
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final boolean gL0() {
        CustomTabs customTabs;
        List<CustomTab> list;
        if (LiveMultiTabDowngradeSetting.INSTANCE.getValue()) {
            return false;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            return true;
        }
        CustomTabInfo customTabInfo = room.customTabInfo;
        return (customTabInfo == null || (customTabs = customTabInfo.customTabs) == null || (list = customTabs.customTabList) == null || list.size() <= 0) ? false : true;
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final void initPublicScreenConfiguration() {
        if (this.LL) {
            return;
        }
        this.LL = true;
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).jc0(new InterfaceC1109090ey3() { // from class: X.0ey2
            @Override // X.InterfaceC1109090ey3
            public final void LIZ() {
            }

            @Override // X.InterfaceC1109090ey3
            public final void LIZIZ(C1109430eyb c1109430eyb) {
            }

            @Override // X.InterfaceC1109090ey3
            public final void LIZLLL(InterfaceC1109320eyQ interfaceC1109320eyQ) {
            }

            @Override // X.InterfaceC1109090ey3
            public final void LJ(AbstractC1111600f26 abstractC1111600f26) {
            }

            @Override // X.InterfaceC1109090ey3
            public final void LJFF(InterfaceC1109340eyS interfaceC1109340eyS) {
            }

            @Override // X.InterfaceC1109090ey3
            public final void LJI(InterfaceC1109350eyT interfaceC1109350eyT) {
            }

            @Override // X.InterfaceC1109090ey3
            public final void LIZJ(C1109030exx c1109030exx) {
                C1109030exx.LIZIZ(new InterfaceC1109140ey8() { // from class: X.0eyD
                    @Override // X.InterfaceC1109140ey8
                    public final boolean LIZ(Room room) {
                        return true;
                    }

                    @Override // X.InterfaceC1109140ey8
                    public final void LIZIZ(DataChannel dataChannel, C1109020exw c1109020exw, C1109020exw c1109020exw2) {
                    }

                    @Override // X.InterfaceC1109140ey8
                    public final void LIZJ(C1109770ez9 c1109770ez9) {
                    }

                    @Override // X.InterfaceC1109140ey8
                    public final int LIZLLL() {
                        return 2;
                    }

                    @Override // X.InterfaceC1109140ey8
                    public final int LJ() {
                        return 0;
                    }

                    @Override // X.InterfaceC1109140ey8
                    public final boolean LJIILIIL() {
                        return false;
                    }
                });
            }

            @Override // X.InterfaceC1109090ey3
            public final void LJII(AbstractC1109730ez5 abstractC1109730ez5) {
                abstractC1109730ez5.LLLIIIIL(C1090140eTU.class, new AbstractC1109740ez6<C1090030eTJ, C1090140eTU, C1097100eei>() { // from class: X.0eej
                    @Override // X.C0J8P
                    /* JADX INFO: renamed from: LJ */
                    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                        if (LJIIIIZZ().LIZLLL) {
                            return new AbstractC1109720ez4<C1090030eTJ, C1090140eTU>(C786410Ut5.Td(layoutInflater, R.layout.hjp, viewGroup, false), LJIIIIZZ()) { // from class: X.0eei
                                public final C01GW LLIZLLLIL;
                                public final C01GW LLJ;
                                public final C01GW LLJI;
                                public final C01GW LLJIJIL;
                                public final C01GW LLJILJIL;
                                public final C01GW LLJILJILJ;
                                public final C01GW LLJILLL;
                                public final C01GW LLJJ;
                                public final C01GW LLJJI;
                                public final C01GW LLJJIII;

                                @Override // X.AbstractC1109720ez4
                                public final C1110060ezc N5() {
                                    return (C1110060ezc) this.LLJJI.getValue();
                                }

                                @Override // X.AbstractC1109720ez4
                                public final ImageView P5() {
                                    return (ImageView) this.LLJJIII.getValue();
                                }

                                {
                                    super(view, c1109770ez9);
                                    this.LLIZLLLIL = C292401Bi.LIZ(new AwS561S0100000_17(view, 589));
                                    this.LLJ = C292401Bi.LIZ(new AwS561S0100000_17(view, 591));
                                    this.LLJI = C292401Bi.LIZ(new AwS561S0100000_17(view, 587));
                                    this.LLJIJIL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
                                    this.LLJILJIL = C292401Bi.LIZ(new AwS561S0100000_17(view, 592));
                                    this.LLJILJILJ = C292401Bi.LIZ(new AwS561S0100000_17(view, 590));
                                    this.LLJILLL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(301));
                                    this.LLJJ = C292401Bi.LIZ(new AwS561S0100000_17(view, 588));
                                    this.LLJJI = C292401Bi.LIZ(new AwS418S0200000_17(view, this, 108));
                                    this.LLJJIII = C292401Bi.LIZ(new AwS418S0200000_17(view, this, 109));
                                }

                                @Override // X.AbstractC1109720ez4
                                public final void T5(C1109600eys c1109600eys, List list) {
                                    StringBuilder sb;
                                    int iLIZIZ;
                                    float fIntValue;
                                    int iLIZIZ2;
                                    int iLIZIZ3;
                                    int iLIZIZ4;
                                    Number numberValueOf;
                                    Text text;
                                    TextFormat textFormat;
                                    Integer num;
                                    String str;
                                    Text text2;
                                    TextFormat textFormat2;
                                    Text text3;
                                    C1090140eTU c1090140eTU = (C1090140eTU) c1109600eys;
                                    S5().removeCallbacks(R5());
                                    C1819620xS4.LIZ().LJIIIZ(c1090140eTU.LIZ.LIZ.brandLogo).LJJI((View) this.LLIZLLLIL.getValue());
                                    Context context = this.itemView.getContext();
                                    C1110060ezc c1110060ezcN5 = N5();
                                    C1090030eTJ c1090030eTJ = c1090140eTU.LJIIIZ;
                                    if (c1090030eTJ.LIZJ.length() > 0) {
                                        sb = new StringBuilder(c1090030eTJ.LIZJ);
                                    } else {
                                        sb = new StringBuilder(C1090030eTJ.LIZ(c1090030eTJ.LIZ.content));
                                    }
                                    c1110060ezcN5.setOriginText(sb);
                                    N5().setText(N5().getOriginText());
                                    ((AbstractC1114210f6J) this.LLJILJILJ.getValue()).setTopSpace(0);
                                    int i = c1090140eTU.LIZLLL + 1;
                                    c1090140eTU.LIZLLL = i;
                                    if (i == 1) {
                                        String strValueOf = String.valueOf(c1090140eTU.LJIIIZ.LIZ.customMessageId);
                                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_custom_message_show");
                                        c474500IjALIZ.LJIIIIZZ();
                                        c474500IjALIZ.LJJII(strValueOf, "message_id");
                                        c474500IjALIZ.LIZ();
                                    }
                                    TextView textView = (TextView) this.LLJ.getValue();
                                    C1090030eTJ c1090030eTJ2 = c1090140eTU.LJIIIZ;
                                    String strLIZ = c1090030eTJ2.LIZIZ;
                                    if (strLIZ.length() == 0) {
                                        strLIZ = C1090030eTJ.LIZ(c1090030eTJ2.LIZ.brandName);
                                    }
                                    textView.setText(strLIZ);
                                    C1109770ez9 c1109770ez9 = this.LL;
                                    if (c1109770ez9 != null) {
                                        c1109770ez9.LIZ((TextView) this.LLJ.getValue());
                                    }
                                    TextView textView2 = (TextView) this.LLJI.getValue();
                                    C1090030eTJ c1090030eTJ3 = c1090140eTU.LJIIIZ;
                                    String strLIZ2 = c1090030eTJ3.LIZLLL;
                                    String str2 = null;
                                    if (strLIZ2 == null) {
                                        CommercialCustomMessage.RightLabel rightLabel = c1090030eTJ3.LIZ.rightLabel;
                                        if (rightLabel != null) {
                                            text3 = rightLabel.content;
                                        } else {
                                            text3 = null;
                                        }
                                        strLIZ2 = C1090030eTJ.LIZ(text3);
                                    }
                                    textView2.setText(strLIZ2);
                                    TextView textView3 = (TextView) this.LLJI.getValue();
                                    C1090030eTJ c1090030eTJ4 = c1090140eTU.LJIIIZ;
                                    c1090030eTJ4.getClass();
                                    try {
                                        CommercialCustomMessage.RightLabel rightLabel2 = c1090030eTJ4.LIZ.rightLabel;
                                        if (rightLabel2 != null && (text2 = rightLabel2.content) != null && (textFormat2 = text2.defaultFormat) != null) {
                                            str = textFormat2.color;
                                        } else {
                                            str = null;
                                        }
                                        iLIZIZ = Color.parseColor(str);
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        iLIZIZ = C20736316Cj.LIZIZ(R.attr.fxc, context);
                                    }
                                    textView3.setTextColor(iLIZIZ);
                                    C16F5 c16f5 = (C16F5) this.LLJI.getValue();
                                    CommercialCustomMessage.RightLabel rightLabel3 = c1090140eTU.LJIIIZ.LIZ.rightLabel;
                                    if (rightLabel3 != null && (text = rightLabel3.content) != null && (textFormat = text.defaultFormat) != null && (num = textFormat.fontSize) != null) {
                                        fIntValue = num.intValue();
                                    } else {
                                        fIntValue = 10.0f;
                                    }
                                    c16f5.setTextSize(1, fIntValue);
                                    ViewGroup.LayoutParams layoutParams = ((View) this.LLJI.getValue()).getLayoutParams();
                                    if (layoutParams != null) {
                                        CommercialCustomMessage.RightLabel rightLabel4 = c1090140eTU.LJIIIZ.LIZ.rightLabel;
                                        if (rightLabel4 != null) {
                                            numberValueOf = Long.valueOf(rightLabel4.height);
                                        } else {
                                            numberValueOf = 14;
                                        }
                                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numberValueOf));
                                    }
                                    ((GradientDrawable) this.LLJILLL.getValue()).setCornerRadius(C497740JfY.LIZIZ(4));
                                    GradientDrawable gradientDrawable = (GradientDrawable) this.LLJILLL.getValue();
                                    C1090030eTJ c1090030eTJ5 = c1090140eTU.LJIIIZ;
                                    c1090030eTJ5.getClass();
                                    try {
                                        CommercialCustomMessage.RightLabel rightLabel5 = c1090030eTJ5.LIZ.rightLabel;
                                        if (rightLabel5 != null) {
                                            str2 = rightLabel5.backgroundColor;
                                        }
                                        iLIZIZ2 = Color.parseColor(str2);
                                    } catch (Exception e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.c9b, context);
                                    }
                                    gradientDrawable.setColor(iLIZIZ2);
                                    ((View) this.LLJI.getValue()).setBackground((Drawable) this.LLJILLL.getValue());
                                    GradientDrawable gradientDrawable2 = (GradientDrawable) this.LLJIJIL.getValue();
                                    C1090030eTJ c1090030eTJ6 = c1090140eTU.LJIIIZ;
                                    Context context2 = N5().getContext();
                                    c1090030eTJ6.getClass();
                                    try {
                                        iLIZIZ3 = Color.parseColor(c1090030eTJ6.LIZ.backgroundColor);
                                    } catch (Exception e3) {
                                        TryCatchGuardChecker.doCheck(e3);
                                        iLIZIZ3 = C20736316Cj.LIZIZ(R.attr.fxy, context2);
                                    }
                                    gradientDrawable2.setColor(iLIZIZ3);
                                    ((GradientDrawable) this.LLJIJIL.getValue()).setCornerRadius(C497740JfY.LIZIZ(8));
                                    GradientDrawable gradientDrawable3 = (GradientDrawable) this.LLJIJIL.getValue();
                                    int iLIZ = C439101nJ.LIZ(1);
                                    C1090030eTJ c1090030eTJ7 = c1090140eTU.LJIIIZ;
                                    Context context3 = N5().getContext();
                                    c1090030eTJ7.getClass();
                                    try {
                                        iLIZIZ4 = Color.parseColor(c1090030eTJ7.LIZ.borderColor);
                                    } catch (Exception e4) {
                                        TryCatchGuardChecker.doCheck(e4);
                                        iLIZIZ4 = C20736316Cj.LIZIZ(R.attr.fxy, context3);
                                    }
                                    gradientDrawable3.setStroke(iLIZ, iLIZIZ4);
                                    ((View) this.LLJJ.getValue()).setBackground((Drawable) this.LLJIJIL.getValue());
                                    this.itemView.setBackground((Drawable) this.LLJILJIL.getValue());
                                    if (!c1090140eTU.LJI) {
                                        c1090140eTU.LJI = true;
                                        N5().setAutoExpand(true);
                                    } else {
                                        N5().setAutoExpand(false);
                                    }
                                    C1109770ez9 c1109770ez92 = this.LL;
                                    if (c1109770ez92 != null) {
                                        c1109770ez92.LIZ(N5());
                                    }
                                    I5(false);
                                }
                            };
                        }
                        return new AbstractC1109720ez4<C1090030eTJ, C1090140eTU>(C786410Ut5.Td(layoutInflater, R.layout.hjq, viewGroup, false), LJIIIIZZ()) { // from class: X.0eei
                            public final C01GW LLIZLLLIL;
                            public final C01GW LLJ;
                            public final C01GW LLJI;
                            public final C01GW LLJIJIL;
                            public final C01GW LLJILJIL;
                            public final C01GW LLJILJILJ;
                            public final C01GW LLJILLL;
                            public final C01GW LLJJ;
                            public final C01GW LLJJI;
                            public final C01GW LLJJIII;

                            @Override // X.AbstractC1109720ez4
                            public final C1110060ezc N5() {
                                return (C1110060ezc) this.LLJJI.getValue();
                            }

                            @Override // X.AbstractC1109720ez4
                            public final ImageView P5() {
                                return (ImageView) this.LLJJIII.getValue();
                            }

                            {
                                super(view, c1109770ez9);
                                this.LLIZLLLIL = C292401Bi.LIZ(new AwS561S0100000_17(view, 589));
                                this.LLJ = C292401Bi.LIZ(new AwS561S0100000_17(view, 591));
                                this.LLJI = C292401Bi.LIZ(new AwS561S0100000_17(view, 587));
                                this.LLJIJIL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
                                this.LLJILJIL = C292401Bi.LIZ(new AwS561S0100000_17(view, 592));
                                this.LLJILJILJ = C292401Bi.LIZ(new AwS561S0100000_17(view, 590));
                                this.LLJILLL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(301));
                                this.LLJJ = C292401Bi.LIZ(new AwS561S0100000_17(view, 588));
                                this.LLJJI = C292401Bi.LIZ(new AwS418S0200000_17(view, this, 108));
                                this.LLJJIII = C292401Bi.LIZ(new AwS418S0200000_17(view, this, 109));
                            }

                            @Override // X.AbstractC1109720ez4
                            public final void T5(C1109600eys c1109600eys, List list) {
                                StringBuilder sb;
                                int iLIZIZ;
                                float fIntValue;
                                int iLIZIZ2;
                                int iLIZIZ3;
                                int iLIZIZ4;
                                Number numberValueOf;
                                Text text;
                                TextFormat textFormat;
                                Integer num;
                                String str;
                                Text text2;
                                TextFormat textFormat2;
                                Text text3;
                                C1090140eTU c1090140eTU = (C1090140eTU) c1109600eys;
                                S5().removeCallbacks(R5());
                                C1819620xS4.LIZ().LJIIIZ(c1090140eTU.LIZ.LIZ.brandLogo).LJJI((View) this.LLIZLLLIL.getValue());
                                Context context = this.itemView.getContext();
                                C1110060ezc c1110060ezcN5 = N5();
                                C1090030eTJ c1090030eTJ = c1090140eTU.LJIIIZ;
                                if (c1090030eTJ.LIZJ.length() > 0) {
                                    sb = new StringBuilder(c1090030eTJ.LIZJ);
                                } else {
                                    sb = new StringBuilder(C1090030eTJ.LIZ(c1090030eTJ.LIZ.content));
                                }
                                c1110060ezcN5.setOriginText(sb);
                                N5().setText(N5().getOriginText());
                                ((AbstractC1114210f6J) this.LLJILJILJ.getValue()).setTopSpace(0);
                                int i = c1090140eTU.LIZLLL + 1;
                                c1090140eTU.LIZLLL = i;
                                if (i == 1) {
                                    String strValueOf = String.valueOf(c1090140eTU.LJIIIZ.LIZ.customMessageId);
                                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_custom_message_show");
                                    c474500IjALIZ.LJIIIIZZ();
                                    c474500IjALIZ.LJJII(strValueOf, "message_id");
                                    c474500IjALIZ.LIZ();
                                }
                                TextView textView = (TextView) this.LLJ.getValue();
                                C1090030eTJ c1090030eTJ2 = c1090140eTU.LJIIIZ;
                                String strLIZ = c1090030eTJ2.LIZIZ;
                                if (strLIZ.length() == 0) {
                                    strLIZ = C1090030eTJ.LIZ(c1090030eTJ2.LIZ.brandName);
                                }
                                textView.setText(strLIZ);
                                C1109770ez9 c1109770ez9 = this.LL;
                                if (c1109770ez9 != null) {
                                    c1109770ez9.LIZ((TextView) this.LLJ.getValue());
                                }
                                TextView textView2 = (TextView) this.LLJI.getValue();
                                C1090030eTJ c1090030eTJ3 = c1090140eTU.LJIIIZ;
                                String strLIZ2 = c1090030eTJ3.LIZLLL;
                                String str2 = null;
                                if (strLIZ2 == null) {
                                    CommercialCustomMessage.RightLabel rightLabel = c1090030eTJ3.LIZ.rightLabel;
                                    if (rightLabel != null) {
                                        text3 = rightLabel.content;
                                    } else {
                                        text3 = null;
                                    }
                                    strLIZ2 = C1090030eTJ.LIZ(text3);
                                }
                                textView2.setText(strLIZ2);
                                TextView textView3 = (TextView) this.LLJI.getValue();
                                C1090030eTJ c1090030eTJ4 = c1090140eTU.LJIIIZ;
                                c1090030eTJ4.getClass();
                                try {
                                    CommercialCustomMessage.RightLabel rightLabel2 = c1090030eTJ4.LIZ.rightLabel;
                                    if (rightLabel2 != null && (text2 = rightLabel2.content) != null && (textFormat2 = text2.defaultFormat) != null) {
                                        str = textFormat2.color;
                                    } else {
                                        str = null;
                                    }
                                    iLIZIZ = Color.parseColor(str);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    iLIZIZ = C20736316Cj.LIZIZ(R.attr.fxc, context);
                                }
                                textView3.setTextColor(iLIZIZ);
                                C16F5 c16f5 = (C16F5) this.LLJI.getValue();
                                CommercialCustomMessage.RightLabel rightLabel3 = c1090140eTU.LJIIIZ.LIZ.rightLabel;
                                if (rightLabel3 != null && (text = rightLabel3.content) != null && (textFormat = text.defaultFormat) != null && (num = textFormat.fontSize) != null) {
                                    fIntValue = num.intValue();
                                } else {
                                    fIntValue = 10.0f;
                                }
                                c16f5.setTextSize(1, fIntValue);
                                ViewGroup.LayoutParams layoutParams = ((View) this.LLJI.getValue()).getLayoutParams();
                                if (layoutParams != null) {
                                    CommercialCustomMessage.RightLabel rightLabel4 = c1090140eTU.LJIIIZ.LIZ.rightLabel;
                                    if (rightLabel4 != null) {
                                        numberValueOf = Long.valueOf(rightLabel4.height);
                                    } else {
                                        numberValueOf = 14;
                                    }
                                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numberValueOf));
                                }
                                ((GradientDrawable) this.LLJILLL.getValue()).setCornerRadius(C497740JfY.LIZIZ(4));
                                GradientDrawable gradientDrawable = (GradientDrawable) this.LLJILLL.getValue();
                                C1090030eTJ c1090030eTJ5 = c1090140eTU.LJIIIZ;
                                c1090030eTJ5.getClass();
                                try {
                                    CommercialCustomMessage.RightLabel rightLabel5 = c1090030eTJ5.LIZ.rightLabel;
                                    if (rightLabel5 != null) {
                                        str2 = rightLabel5.backgroundColor;
                                    }
                                    iLIZIZ2 = Color.parseColor(str2);
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.c9b, context);
                                }
                                gradientDrawable.setColor(iLIZIZ2);
                                ((View) this.LLJI.getValue()).setBackground((Drawable) this.LLJILLL.getValue());
                                GradientDrawable gradientDrawable2 = (GradientDrawable) this.LLJIJIL.getValue();
                                C1090030eTJ c1090030eTJ6 = c1090140eTU.LJIIIZ;
                                Context context2 = N5().getContext();
                                c1090030eTJ6.getClass();
                                try {
                                    iLIZIZ3 = Color.parseColor(c1090030eTJ6.LIZ.backgroundColor);
                                } catch (Exception e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    iLIZIZ3 = C20736316Cj.LIZIZ(R.attr.fxy, context2);
                                }
                                gradientDrawable2.setColor(iLIZIZ3);
                                ((GradientDrawable) this.LLJIJIL.getValue()).setCornerRadius(C497740JfY.LIZIZ(8));
                                GradientDrawable gradientDrawable3 = (GradientDrawable) this.LLJIJIL.getValue();
                                int iLIZ = C439101nJ.LIZ(1);
                                C1090030eTJ c1090030eTJ7 = c1090140eTU.LJIIIZ;
                                Context context3 = N5().getContext();
                                c1090030eTJ7.getClass();
                                try {
                                    iLIZIZ4 = Color.parseColor(c1090030eTJ7.LIZ.borderColor);
                                } catch (Exception e4) {
                                    TryCatchGuardChecker.doCheck(e4);
                                    iLIZIZ4 = C20736316Cj.LIZIZ(R.attr.fxy, context3);
                                }
                                gradientDrawable3.setStroke(iLIZ, iLIZIZ4);
                                ((View) this.LLJJ.getValue()).setBackground((Drawable) this.LLJIJIL.getValue());
                                this.itemView.setBackground((Drawable) this.LLJILJIL.getValue());
                                if (!c1090140eTU.LJI) {
                                    c1090140eTU.LJI = true;
                                    N5().setAutoExpand(true);
                                } else {
                                    N5().setAutoExpand(false);
                                }
                                C1109770ez9 c1109770ez92 = this.LL;
                                if (c1109770ez92 != null) {
                                    c1109770ez92.LIZ(N5());
                                }
                                I5(false);
                            }
                        };
                    }
                });
            }
        });
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final boolean lm1() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            return hU(room);
        }
        return false;
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final boolean VF1() {
        return Uv2() || gL0();
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final Class<? extends LiveRecyclableWidget> Ar0() {
        return XMultiTabContainerWidget.class;
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final Class<? extends LiveRecyclableWidget> Hc2() {
        return InteractiveTopBarWidget.class;
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final Class<? extends LiveRecyclableWidget> Ln1() {
        return ProgrammedLiveTitleWidget.class;
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final Class<? extends LiveRecyclableWidget> TE2() {
        return CastersWidget.class;
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final Class<? extends LiveRecyclableWidget> gE() {
        return CastersBackgroundWidget.class;
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final Class<? extends LiveRecyclableWidget> ma0() {
        return ProgrammedLiveFollowCardWidget.class;
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final Class<? extends LiveRecyclableWidget> r51() {
        return ProgrammedLiveUserInfoWidget.class;
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final InterfaceC520300Kaq M52(EnumC520290Kap enumC520290Kap) {
        return (InterfaceC520300Kaq) ((Map) this.LLILLL.getValue()).get(enumC520290Kap);
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final InterfaceC520300Kaq SD(int i) {
        return (InterfaceC520300Kaq) ((Map) this.LLILLJJLI.getValue()).get(Integer.valueOf(i));
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final boolean hU(Room room) {
        if (room != null && room.topFrameSummary != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final void HZ(Fragment fragment, DataChannel dataChannel) {
        InterfaceC1090080eTO interfaceC1090080eTOSq1;
        if (dataChannel != null && (interfaceC1090080eTOSq1 = sq1(fragment, dataChannel)) != null) {
            interfaceC1090080eTOSq1.clearData();
        }
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final LiveRecyclableWidget Ue0(boolean z, RecyclableWidgetManager recyclableWidgetManager) {
        if (z) {
            return recyclableWidgetManager.getRecyclableWidgetFromCacheOrNew(ProgrammedLiveOnlineAudienceCollapseWidget.class, null, new AObjectS60S0000000_7(21));
        }
        return recyclableWidgetManager.getRecyclableWidgetFromCacheOrNew(ProgrammedLiveOnlineAudienceLandscapeWidget.class, null, new AObjectS60S0000000_7(22));
    }

    @Override // com.bytedance.android.live.programmedlive.IProgrammedLiveService
    public final InterfaceC1090080eTO sq1(Fragment fragment, final DataChannel dataChannel) {
        if (fragment == null || fragment.getActivity() == null || !C500260Jjc.LJJJI(Boolean.valueOf(fragment.isAdded()))) {
            return null;
        }
        return (InterfaceC1090080eTO) ViewModelProviders.of(fragment, new ViewModelProvider.Factory() { // from class: X.0Kak
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                return new PLCusPinMsgViewModel(dataChannel);
            }
        }).get(PLCusPinMsgViewModel.class);
    }
}
