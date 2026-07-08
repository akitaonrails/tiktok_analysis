package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.cell;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C09R3;
import X.C0GZW;
import X.C0IJT;
import X.C0ZP4;
import X.C1152620g6G;
import X.C1161920gLG;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1322090kVb;
import X.C1324610kZf;
import X.C13LE;
import X.C13LP;
import X.C14KS;
import X.C1770850wBP;
import X.C1781580wSi;
import X.C1813080xHW;
import X.C1814780xKG;
import X.C1814830xKL;
import X.C1819620xS4;
import X.C1827540xeq;
import X.C1827550xer;
import X.C1827560xes;
import X.C1827570xet;
import X.C1827580xeu;
import X.C1827590xev;
import X.C1827600xew;
import X.C1827610xex;
import X.C1827620xey;
import X.C1827630xez;
import X.C1827640xf0;
import X.C1827650xf1;
import X.C1827660xf2;
import X.C1827670xf3;
import X.C1827680xf4;
import X.C1827690xf5;
import X.C1827700xf6;
import X.C1827710xf7;
import X.C1827720xf8;
import X.C1827730xf9;
import X.C1827740xfA;
import X.C1827750xfB;
import X.C1827760xfC;
import X.C1827770xfD;
import X.C1827780xfE;
import X.C1827790xfF;
import X.C1827800xfG;
import X.C1827810xfH;
import X.C1827820xfI;
import X.C1827830xfJ;
import X.C1827840xfK;
import X.C1827850xfL;
import X.C1827860xfM;
import X.C1827870xfN;
import X.C1827880xfO;
import X.C1827890xfP;
import X.C1827900xfQ;
import X.C1827910xfR;
import X.C1827920xfS;
import X.C1827930xfT;
import X.C1827940xfU;
import X.C1827950xfV;
import X.C1827960xfW;
import X.C1827970xfX;
import X.C1827980xfY;
import X.C1827990xfZ;
import X.C1828000xfa;
import X.C1828030xfd;
import X.C1828040xfe;
import X.C1828050xff;
import X.C1828060xfg;
import X.C1828070xfh;
import X.C1828080xfi;
import X.C1828090xfj;
import X.C1828100xfk;
import X.C1828110xfl;
import X.C1828120xfm;
import X.C1828130xfn;
import X.C1828140xfo;
import X.C1828150xfp;
import X.C1828160xfq;
import X.C1828170xfr;
import X.C1828180xfs;
import X.C1828190xft;
import X.C1828200xfu;
import X.C1828210xfv;
import X.C1828220xfw;
import X.C1828230xfx;
import X.C1828240xfy;
import X.C1828250xfz;
import X.C1828260xg0;
import X.C1828270xg1;
import X.C1828280xg2;
import X.C1828290xg3;
import X.C1828300xg4;
import X.C1828310xg5;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C202500qF;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C427690Gpr;
import X.C435300H5c;
import X.C435310H5d;
import X.C452080Ho6;
import X.C452501pT;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1142670fqD;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.DecorationEditLogDataEvent;
import com.bytedance.android.live.NativeDecorationOperationEvent;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.cell.LiveDecorationCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsFunctionsViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel;
import com.bytedance.android.livesdk.dataChannel.BroadcastPageChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.subscription.SubscribeUpsellLynxUrlSetting;
import com.bytedance.android.livesdk.livesetting.decoration.SubscriptionDSAUrl;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.ImageContent;
import com.bytedance.android.livesdk.model.RecommendBoardInfo;
import com.bytedance.android.livesdk.model.SceneryContent;
import com.bytedance.android.livesdk.model.SourcePB;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveDecorationCell extends PowerCell<C1814780xKG> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C01GW LL = C452501pT.LIZIZ(new C1828170xfr(this));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1828240xfy(this));
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1828190xft(this));
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1828180xfs(this));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1828100xfk(this));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C1828140xfo(this));
    public final C01GW LLIZ = C452501pT.LIZIZ(new C1828120xfm(this));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1828090xfj(this));
    public final C01GW LLJ = C452501pT.LIZIZ(new C1828160xfq(this));
    public final C01GW LLJI = C452501pT.LIZIZ(new C1828150xfp(this));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C1828110xfl(this));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C1828130xfn(this));
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public C1814780xKG LLJJ;
    public final C01GW LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveDecorationCell.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/boardspanel/assems/viewmodel/LiveBoardsPageViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(LiveDecorationCell.class, "functionsVM", "getFunctionsVM()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/boardspanel/assems/viewmodel/LiveBoardsFunctionsViewModel;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = (View) this.LLILZ.getValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.exj, this.itemView.getContext()));
        gradientDrawable.setCornerRadius(C497740JfY.LIZIZ(11.0f));
        view.setBackground(gradientDrawable);
        U5().setButtonStartIcon(Integer.valueOf(R.raw.icon_ellipsis_horizontal_fill));
        U5().setIconWidth((int) C497740JfY.LIZIZ(16.0f));
        U5().setIconHeight((int) C497740JfY.LIZIZ(16.0f));
        U5().setButtonVariant(2);
        U5().LJJJJL(new C435310H5d(this));
        double dLJFF = ((((double) (C14KS.LJFF() - ((int) C497740JfY.LIZIZ(32.0f)))) / 2.0d) * 1.1508379888268156d) + ((double) ((int) C497740JfY.LIZIZ(8.0f)));
        ViewGroup.LayoutParams layoutParams = ((View) this.LL.getValue()).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) dLJFF;
            C786410Ut5.m6((ConstraintLayout) this.LL.getValue(), layoutParams);
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xK1
            {
                super(200L);
            }

            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                C1814780xKG c1814780xKG;
                String string;
                if (view2 != null && (c1814780xKG = this.LLILZ.LLJJ) != null) {
                    if (!C1152620g6G.LIZ(c1814780xKG.LLILLL)) {
                        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131851440));
                        return;
                    }
                    if (!C1152620g6G.LIZIZ(c1814780xKG.LLILLL)) {
                        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131851349));
                        return;
                    }
                    C1790620whI c1790620whI = C1790620whI.LIZ;
                    c1790620whI.LIZ(0L);
                    this.LLILZ.T5().setLoading(true);
                    C1790620whI.LJIILIIL(EnumC1154390g97.BOARD_APPLY, c1814780xKG.LLILLL.id);
                    LiveBoardsPageViewModel liveBoardsPageViewModelW5 = this.LLILZ.W5();
                    if (c1814780xKG.LLILZIL) {
                        c1790620whI.LIZLLL(EnumC1779720wPi.USER_CANCEL_BOARD);
                        int iListIndexOf = liveBoardsPageViewModelW5.listIndexOf(c1814780xKG);
                        C1814780xKG c1814780xKGLIZLLL = C1814780xKG.LIZLLL(c1814780xKG, null, false, 0, 27);
                        InterfaceC1814530xJr interfaceC1814530xJr = liveBoardsPageViewModelW5.LLILZ;
                        if (interfaceC1814530xJr != null) {
                            interfaceC1814530xJr.LJIIJJI();
                        }
                        Board board = c1814780xKG.LLILLL;
                        DataChannel dataChannel = liveBoardsPageViewModelW5.LLILLL;
                        if (dataChannel == null || (string = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel)).toString()) == null) {
                            string = CardStruct.IStatusCode.DEFAULT;
                        }
                        DataChannel dataChannel2 = liveBoardsPageViewModelW5.LLILLL;
                        if (dataChannel2 != null) {
                            dataChannel2.LC0(NativeDecorationOperationEvent.class, new C443120HZe(board, string, 3));
                        }
                        liveBoardsPageViewModelW5.listSetItemAt(iListIndexOf, c1814780xKGLIZLLL);
                        liveBoardsPageViewModelW5.CQ2(c1814780xKG, "cancel");
                        DataChannel dataChannel3 = liveBoardsPageViewModelW5.LLILLL;
                        if (dataChannel3 != null) {
                            dataChannel3.SX0(C772010UQd.class, new HashMap());
                        }
                        liveBoardsPageViewModelW5.setState(new C1815000xKc(c1814780xKG));
                        return;
                    }
                    LiveBoardsPageViewModel.wQ2(c1814780xKG);
                    c1790620whI.LIZLLL(EnumC1779720wPi.USER_APPLY_BOARD);
                    HashMap map = new HashMap();
                    String str = liveBoardsPageViewModelW5.zQ2().LL;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    map.put("decoration_entrance", str);
                    DataChannel dataChannel4 = liveBoardsPageViewModelW5.LLILLL;
                    if (dataChannel4 != null) {
                        dataChannel4.LC0(DecorationEditLogDataEvent.class, new C1817550xOj(map, null, null, 14));
                    }
                    HashMap<String, String> map2 = new HashMap<>();
                    if (C500260Jjc.LJJ()) {
                        map2.put("entry_source", "in_live_setting");
                    }
                    String str3 = liveBoardsPageViewModelW5.zQ2().LL;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    map2.put("entrance_source", str2);
                    InterfaceC1814530xJr interfaceC1814530xJr2 = liveBoardsPageViewModelW5.LLILZ;
                    if (interfaceC1814530xJr2 == null) {
                        return;
                    }
                    interfaceC1814530xJr2.LJIIIZ(c1814780xKG.LLILLL, false, new C1814620xK0(liveBoardsPageViewModelW5, c1814780xKG), map2);
                }
            }
        }, T5());
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xK6
            {
                super(200L);
            }

            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                LiveDecorationCell liveDecorationCell;
                final C1814780xKG c1814780xKG;
                Boolean boolValueOf;
                SourcePB sourcePB;
                if (view2 != null && (c1814780xKG = (liveDecorationCell = this.LLILZ).LLJJ) != null) {
                    liveDecorationCell.W5().CQ2(c1814780xKG, "more");
                    final LiveDecorationCell liveDecorationCell2 = this.LLILZ;
                    C19EG c19egLIZ = C1124140fMK.LIZ(liveDecorationCell2.itemView.getContext());
                    if (c19egLIZ != null) {
                        C1390850mIV c1390850mIV = new C1390850mIV();
                        ArrayList arrayList = new ArrayList();
                        C1247510iZJ c1247510iZJ = new C1247510iZJ();
                        c1247510iZJ.LIZ = C497740JfY.LJIJI(2131851486);
                        c1247510iZJ.LIZJ = 1;
                        c1247510iZJ.LJ = new View.OnClickListener() { // from class: X.0xK3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                final LiveDecorationCell liveDecorationCell3 = liveDecorationCell2;
                                final C1814780xKG c1814780xKG2 = c1814780xKG;
                                if (liveDecorationCell3.itemView.getContext() != null) {
                                    C782110Um9 c782110Um9 = new C782110Um9(liveDecorationCell3.itemView.getContext());
                                    c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131851435));
                                    C494720Jag c494720Jag = new C494720Jag();
                                    C755620TkW c755620TkW = new C755620TkW();
                                    c755620TkW.LIZ = C497740JfY.LJIJI(2131851434);
                                    c755620TkW.LIZJ = new InterfaceC743640TFa() { // from class: X.0xK2
                                        @Override // X.InterfaceC743640TFa
                                        public final void LIZ(LiveDialog liveDialog) {
                                            LiveBoardsPageViewModel liveBoardsPageViewModelW5 = liveDecorationCell3.W5();
                                            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveBoardsPageViewModelW5), C0PEM.LIZJ, null, new C1814590xJx(liveBoardsPageViewModelW5, c1814780xKG2, null), 2);
                                            liveDialog.dismiss();
                                        }
                                    };
                                    c494720Jag.LIZ(new C0TZ2(c755620TkW));
                                    C755630TkX c755630TkX = new C755630TkX();
                                    c755630TkX.LIZ = C497740JfY.LJIJI(2131851433);
                                    c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0xK4
                                        @Override // X.InterfaceC743640TFa
                                        public final void LIZ(LiveDialog liveDialog) {
                                            liveDecorationCell3.W5().DQ2(c1814780xKG2, "click", "cancel");
                                            liveDialog.dismiss();
                                        }
                                    };
                                    c494720Jag.LIZ(new C0TZ3(c755630TkX));
                                    c782110Um9.LIZJ(new C494730Jah(c494720Jag));
                                    c782110Um9.LJIILL = false;
                                    C786410Ut5.E4(c782110Um9.LIZ());
                                    liveDecorationCell3.W5().DQ2(c1814780xKG2, "show", "");
                                }
                                LiveDecorationCell liveDecorationCell4 = liveDecorationCell2;
                                C1814780xKG c1814780xKG3 = liveDecorationCell4.LLJJ;
                                if (c1814780xKG3 != null) {
                                    liveDecorationCell4.W5().EQ2(c1814780xKG3, "click", "delete");
                                }
                            }
                        };
                        if (!C1152620g6G.LIZ(c1814780xKG.LLILLL)) {
                            arrayList.add(c1247510iZJ);
                        } else {
                            C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
                            c1247510iZJ2.LIZ = C497740JfY.LJIJI(2131851487);
                            c1247510iZJ2.LIZJ = 0;
                            c1247510iZJ2.LJ = new View.OnClickListener() { // from class: X.0xK7
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    LiveDecorationCell liveDecorationCell3 = liveDecorationCell2;
                                    C1814780xKG c1814780xKG2 = liveDecorationCell3.LLJJ;
                                    if (c1814780xKG2 != null) {
                                        liveDecorationCell3.W5().yQ2(view3.getContext(), c1814780xKG2);
                                        liveDecorationCell3.W5().EQ2(c1814780xKG2, "click", "edit");
                                    }
                                }
                            };
                            if (!C1152620g6G.LIZIZ(c1814780xKG.LLILLL)) {
                                c1247510iZJ2.LIZLLL = false;
                                c1247510iZJ2.LJ = new View.OnClickListener() { // from class: X.0THW
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131851349));
                                    }
                                };
                            } else {
                                c1247510iZJ2.LJ = new View.OnClickListener() { // from class: X.0xK8
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        LiveDecorationCell liveDecorationCell3 = liveDecorationCell2;
                                        C1814780xKG c1814780xKG2 = liveDecorationCell3.LLJJ;
                                        if (c1814780xKG2 != null) {
                                            liveDecorationCell3.W5().yQ2(view3.getContext(), c1814780xKG2);
                                            liveDecorationCell3.W5().EQ2(c1814780xKG2, "click", "edit");
                                        }
                                    }
                                };
                            }
                            EnumC500290Jjf enumC500290Jjf = (EnumC500290Jjf) DataChannelGlobal.LLILZ.gg0(BroadcastPageChannel.class);
                            String str = null;
                            if (enumC500290Jjf != null) {
                                boolValueOf = Boolean.valueOf(enumC500290Jjf.isPreviewPage());
                            } else {
                                boolValueOf = null;
                            }
                            if (C500260Jjc.LJJJI(boolValueOf)) {
                                RecommendBoardInfo recommendBoardInfo = c1814780xKG.LLILLL.recommendBoardInfo;
                                if (recommendBoardInfo != null && (sourcePB = recommendBoardInfo.sourcePb) != null) {
                                    str = sourcePB.generateVersion;
                                }
                                if (!Intrinsics.LJFF(str, "image_version")) {
                                    arrayList.add(c1247510iZJ2);
                                }
                            }
                            arrayList.add(c1247510iZJ);
                        }
                        c1390850mIV.LJI(arrayList);
                        c1390850mIV.LIZ.LL = new DialogInterface.OnCancelListener() { // from class: X.0xK5
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                LiveDecorationCell liveDecorationCell3 = liveDecorationCell2;
                                C1814780xKG c1814780xKG2 = liveDecorationCell3.LLJJ;
                                if (c1814780xKG2 != null) {
                                    liveDecorationCell3.W5().EQ2(c1814780xKG2, "click", "cancel");
                                }
                            }
                        };
                        c1390850mIV.LIZJ().show(c19egLIZ.getSupportFragmentManager(), "LiveBoardsEditItemPressTag");
                    }
                    liveDecorationCell2.W5().EQ2(c1814780xKG, "show", "");
                }
            }
        }, U5());
        C786410Ut5.Y7(S5(), new View.OnClickListener() { // from class: X.0Jek
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String boardDecorationAuditStatusLive;
                String string;
                LiveDecorationCell liveDecorationCell = this.LL;
                C1814780xKG c1814780xKG = liveDecorationCell.LLJJ;
                if (c1814780xKG != null) {
                    Board board = c1814780xKG.LLILLL;
                    if (board.status == 4) {
                        if (C500260Jjc.LJJIJLIJ()) {
                            boardDecorationAuditStatusLive = SubscribeUpsellLynxUrlSetting.INSTANCE.getBoardDecorationAuditStatus();
                        } else {
                            boardDecorationAuditStatusLive = SubscribeUpsellLynxUrlSetting.INSTANCE.getBoardDecorationAuditStatusLive();
                        }
                        Uri uriBuild = UriProtector.parse(boardDecorationAuditStatusLive).buildUpon().appendQueryParameter("board_id", String.valueOf(c1814780xKG.LLILLL.id)).build();
                        if (uriBuild == null || (string = uriBuild.toString()) == null) {
                            string = "";
                        }
                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(view2.getContext(), string);
                        return;
                    }
                    long j = board.violationId;
                    if (j == 0) {
                        return;
                    }
                    liveDecorationCell.getClass();
                    String appealUrl = SubscriptionDSAUrl.INSTANCE.getValue().getAppealUrl();
                    HashMap map = new HashMap();
                    map.put("violation_id", String.valueOf(j));
                    map.put("enter_from", "board_management_page");
                    ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).w2().LIZJ(liveDecorationCell.itemView.getContext(), appealUrl, map);
                }
            }
        });
        C736680Sv4.LJIIIIZZ(this, W5(), new C2217381BqS() { // from class: X.0xMB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1815950xM9) obj).LLJILJILJ;
            }
        }, C736820SvI.LIZLLL(), new C1814830xKL(this), 4);
    }

    public LiveDecorationCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveBoardsPageViewModel.class);
        C1827580xeu c1827580xeu = new C1827580xeu(c19719912DlLIZ);
        C1828290xg3 c1828290xg3 = new C1828290xg3();
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new C1828230xfx(c19719912DlLIZ), c1827580xeu, new C1827960xfW(), new C1827810xfH(this), new C1827670xf3(this), new C1828030xfd(this), c1828290xg3, new C1827560xes(this), null, new C1827630xez(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C1827760xfC c1827760xfC = new C1827760xfC(this);
            C1828070xfh c1828070xfh = new C1828070xfh(this);
            C1828220xfw c1828220xfw = new C1828220xfw(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1827930xfT((InterfaceC451590HnJ) obj, c1827760xfC));
            C1827890xfP c1827890xfP = new C1827890xfP(c01gwLIZIZ);
            C1827900xfQ c1827900xfQ = new C1827900xfQ(c01gwLIZIZ);
            C1827910xfR c1827910xfR = new C1827910xfR(c01gwLIZIZ);
            C1827820xfI c1827820xfI = new C1827820xfI(c01gwLIZIZ);
            C1827830xfJ c1827830xfJ = new C1827830xfJ(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c1828220xfw, c1827580xeu, new C452080Ho6(), c1827890xfP, c1827900xfQ, c1828070xfh, c1828290xg3, c1827910xfR, c1827820xfI, c1827830xfJ);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C1828200xfu(c19719912DlLIZ), c1827580xeu, new C1827950xfV(), new C1827780xfE(this), new C1827720xf8(this), new C1828050xff(this), c1828290xg3, new C1827540xeq(this), null, new C1827640xf0(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C1828210xfv(c19719912DlLIZ), c1827580xeu, new C1827970xfX(), new C1827750xfB(this), new C1827680xf4(this), new C1827690xf5(this), c1828290xg3, null, null, new C1827590xev(this));
        }
        this.LLJILJILJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LiveBoardsFunctionsViewModel.class);
        C1827600xew c1827600xew = new C1827600xew(c19719912DlLIZ2);
        C1828300xg4 c1828300xg4 = new C1828300xg4();
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new C1828280xg2(c19719912DlLIZ2), c1827600xew, new C1828000xfa(), new C1827800xfG(this), new C1827660xf2(this), new C1828080xfi(this), c1828300xg4, new C1827570xet(this), null, new C1827620xey(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C1827740xfA c1827740xfA = new C1827740xfA(this);
            C1828040xfe c1828040xfe = new C1828040xfe(this);
            C1828250xfz c1828250xfz = new C1828250xfz(c19719912DlLIZ2);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new C1827920xfS((InterfaceC451590HnJ) obj, c1827740xfA));
            C1827840xfK c1827840xfK = new C1827840xfK(c01gwLIZIZ2);
            C1827850xfL c1827850xfL = new C1827850xfL(c01gwLIZIZ2);
            C1827860xfM c1827860xfM = new C1827860xfM(c01gwLIZIZ2);
            C1827870xfN c1827870xfN = new C1827870xfN(c01gwLIZIZ2);
            C1827880xfO c1827880xfO = new C1827880xfO(c01gwLIZIZ2);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(c1828250xfz, c1827600xew, new C452080Ho6(), c1827840xfK, c1827850xfL, c1828040xfe, c1828300xg4, c1827860xfM, c1827870xfN, c1827880xfO);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new C1828260xg0(c19719912DlLIZ2), c1827600xew, new C1827980xfY(), new C1827790xfF(this), new C1827730xf9(this), new C1828060xfg(this), c1828300xg4, new C1827550xer(this), null, new C1827650xf1(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new C1828270xg1(c19719912DlLIZ2), c1827600xew, new C1827990xfZ(), new C1827770xfD(this), new C1827700xf6(this), new C1827710xf7(this), c1828300xg4, null, null, new C1827610xex(this));
        }
        this.LLJILLL = assemVMLazy2;
        this.LLJJI = C452501pT.LIZIZ(new C1827940xfU());
    }

    public final ConstraintLayout S5() {
        return (ConstraintLayout) this.LLILZIL.getValue();
    }

    public final C197039127h T5() {
        return (C197039127h) this.LLJI.getValue();
    }

    public final C197039127h U5() {
        return (C197039127h) this.LLJ.getValue();
    }

    public final C0GZW V5() {
        return (C0GZW) this.LLILLL.getValue();
    }

    public final LiveBoardsPageViewModel W5() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (LiveBoardsPageViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C1814780xKG c1814780xKG = this.LLJJ;
        if (c1814780xKG != null) {
            C1781580wSi c1781580wSiZQ2 = W5().zQ2();
            Board board = c1814780xKG.LLILLL;
            if (board.version != 2) {
                C1813080xHW.LIZJ(board, c1814780xKG.LLIZ, c1814780xKG.LLILZIL, Integer.valueOf(c1814780xKG.LLILZLL), "show", "", c1781580wSiZQ2.LLILZ, c1781580wSiZQ2.LL, -1).LIZ();
                return;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_my_decoration_card");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            c474500IjALIZ.LJJII(c1781580wSiZQ2.LLILZ, "room_id");
            c474500IjALIZ.LJJII(c1781580wSiZQ2.LL, "decoration_entrance");
            c474500IjALIZ.LJJII(Long.valueOf(c1814780xKG.LLILLL.id), "decoration_set_id");
            c474500IjALIZ.LJJII(c1814780xKG.LLILZIL ? "1" : CardStruct.IStatusCode.DEFAULT, "is_ongoing");
            RecommendBoardInfo recommendBoardInfo = c1814780xKG.LLILLL.recommendBoardInfo;
            c474500IjALIZ.LJJII(Integer.valueOf(recommendBoardInfo != null ? recommendBoardInfo.boardSource : 0), "board_source");
            RecommendBoardInfo recommendBoardInfo2 = c1814780xKG.LLILLL.recommendBoardInfo;
            c474500IjALIZ.LJJII(Long.valueOf(recommendBoardInfo2 != null ? recommendBoardInfo2.recommendBoardId : 0L), "rec_template_id");
            c474500IjALIZ.LJJII("show", "action_type");
            c474500IjALIZ.LJJII(C1813080xHW.LIZ(Integer.valueOf(c1814780xKG.LLILZLL)), "audit_status");
            c474500IjALIZ.LIZ();
        }
    }

    public final void I5(C1814780xKG c1814780xKG) {
        int iLJ;
        Board board;
        int i = c1814780xKG.LLILZLL;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    R5(false);
                    C786410Ut5.LL(8, S5());
                    T5().setEnabled(true);
                    return;
                }
                ((LiveIconView) this.LLIZ.getValue()).setIcon(C20736316Cj.LIZLLL(R.attr.dn9, this.itemView.getContext()));
                ((LiveIconView) this.LLIZ.getValue()).setIconTint(C20736316Cj.LIZIZ(R.attr.ezv, this.itemView.getContext()));
                ((TextView) this.LLILZLL.getValue()).setTextColor(C20736316Cj.LIZIZ(R.attr.ezv, this.itemView.getContext()));
                ((TextView) this.LLILZLL.getValue()).setText(C497740JfY.LJIJI(2131851413));
                C1814780xKG c1814780xKG2 = this.LLJJ;
                if (c1814780xKG2 == null || (board = c1814780xKG2.LLILLL) == null || ((int) board.violationId) != 0 || c1814780xKG.LLILZLL == 4) {
                    C427690Gpr.LJI(S5(), null);
                    LiveIconView liveIconView = (LiveIconView) this.LLIZLLLIL.getValue();
                    if (((Boolean) this.LLJJI.getValue()).booleanValue()) {
                        iLJ = C20736316Cj.LJ(R.attr.d36, getContext());
                    } else {
                        iLJ = C20736316Cj.LJ(R.attr.d3h, getContext());
                    }
                    liveIconView.setIcon(iLJ);
                    ((LiveIconView) this.LLIZLLLIL.getValue()).setIconTint(C20736316Cj.LIZIZ(R.attr.ezv, this.itemView.getContext()));
                }
                R5(true);
                C786410Ut5.LL(0, S5());
                S5().setClickable(true);
                C786410Ut5.LLJJIJIL((LiveIconView) this.LLIZLLLIL.getValue(), 0);
                T5().setEnabled(false);
                return;
            }
            R5(false);
            C786410Ut5.LL(8, S5());
            T5().setEnabled(true);
            return;
        }
        ((LiveIconView) this.LLIZ.getValue()).setIcon(C20736316Cj.LIZLLL(R.attr.d4e, this.itemView.getContext()));
        ((LiveIconView) this.LLIZ.getValue()).setIconTint(C20736316Cj.LIZIZ(R.attr.cby, this.itemView.getContext()));
        ((TextView) this.LLILZLL.getValue()).setTextColor(C20736316Cj.LIZIZ(R.attr.cby, this.itemView.getContext()));
        ((TextView) this.LLILZLL.getValue()).setText(C497740JfY.LJIJI(2131851414));
        R5(true);
        C786410Ut5.LL(0, S5());
        S5().setClickable(false);
        C786410Ut5.LLJJIJIL((LiveIconView) this.LLIZLLLIL.getValue(), 8);
        T5().setEnabled(false);
    }

    public final void L5(C1814780xKG c1814780xKG) {
        boolean z;
        boolean zLIZ = C1152620g6G.LIZ(c1814780xKG.LLILLL);
        boolean zLIZIZ = C1152620g6G.LIZIZ(c1814780xKG.LLILLL);
        if (zLIZ && zLIZIZ) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            T5().setEnabled(true);
            T5().setLoading(false);
            T5().setText(C497740JfY.LJIJI(2131851409));
            T5().setButtonVariant(0);
            X5(false);
            C786410Ut5.w5(T5(), 0.4f);
            return;
        }
        C786410Ut5.w5(T5(), 1.0f);
        if (T5().isEnabled() && c1814780xKG.LLILZIL) {
            T5().setText(C497740JfY.LJIJI(2131851408));
            T5().setButtonVariant(2);
            X5(c1814780xKG.LLILZIL);
        } else {
            T5().setLoading(false);
            T5().setText(C497740JfY.LJIJI(2131851409));
            T5().setButtonVariant(0);
            X5(c1814780xKG.LLILZIL);
        }
    }

    public final void N5(C1814780xKG c1814780xKG) {
        if (c1814780xKG.LLILZ != null) {
            ((C1322090kVb) this.LLILLJJLI.getValue()).setImageDrawable(new BitmapDrawable(((View) this.LLILLJJLI.getValue()).getContext().getResources(), c1814780xKG.LLILZ));
        } else {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(c1814780xKG.LLILLL.previewImage);
            c1324610kZfLJIIIZ.LJJ = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJIIL = new InterfaceC1142670fqD() { // from class: X.0xfb
                @Override // X.InterfaceC1142670fqD
                public final void LIZ() {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZIZ(Animatable animatable) {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZJ(int i, int i2, String str) {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZLLL(String str, Exception exc) {
                }
            };
            c1324610kZfLJIIIZ.LJJI((View) this.LLILLJJLI.getValue());
        }
        if (c1814780xKG.LLIZ) {
            AssemVMLazy assemVMLazy = this.LLJILLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
            assemVMLazy.getValue();
            String boardContentBrandLabel = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBoardContentBrandLabel();
            C786410Ut5.LJZ(0, (FrameLayout) this.LLJILJIL.getValue());
            ((TextView) this.LLJIJIL.getValue()).setText(boardContentBrandLabel);
        }
    }

    public final void P5(C1814780xKG c1814780xKG) {
        ImageModel imageModel;
        BoardItem next;
        SceneryContent sceneryContent;
        SceneryContent sceneryContent2;
        ImageContent imageContent;
        Iterator<BoardItem> it2 = c1814780xKG.LLILLL.boardItemList.iterator();
        while (true) {
            imageModel = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.boardItemType == 6) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        BoardItem boardItem = next;
        if (boardItem != null && (sceneryContent2 = boardItem.sceneryContent) != null && (imageContent = sceneryContent2.imageContent) != null) {
            imageModel = imageContent.image;
        }
        C0GZW.LJIIIIZZ(V5());
        if (imageModel != null) {
            int iLIZIZ = (int) C497740JfY.LIZIZ(12.0f);
            if (boardItem != null && (sceneryContent = boardItem.sceneryContent) != null && sceneryContent.sceneryType == 3) {
                V5().LIZJ(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
                C500260Jjc.LJJZ(((View) this.LL.getValue()).getLayoutParams().height, V5());
                V5().LIZLLL(false);
            } else {
                V5().LIZJ(iLIZIZ, 0, iLIZIZ, 0);
                V5().LIZLLL(true);
                C500260Jjc.LJJZ((int) (((double) ((View) this.LL.getValue()).getLayoutParams().height) * 0.5d), V5());
            }
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJJ = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJIIL = new InterfaceC1142670fqD() { // from class: X.0xfc
                @Override // X.InterfaceC1142670fqD
                public final void LIZ() {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZIZ(Animatable animatable) {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZJ(int i, int i2, String str) {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZLLL(String str, Exception exc) {
                }
            };
            c1324610kZfLJIIIZ.LJJI(V5());
        }
    }

    public final void R5(boolean z) {
        float f;
        View view = (View) this.LLILZ.getValue();
        if (z) {
            f = 0.7f;
        } else {
            f = 0.0f;
        }
        C786410Ut5.T4(view, f);
    }

    public final void X5(boolean z) {
        Context context = getContext();
        if (context != null) {
            T5().LJJJJL(new C435300H5c(context, z, this));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1814780xKG c1814780xKG = (C1814780xKG) interfaceC1891350zJl;
        super.onBindItemView(c1814780xKG);
        this.LLJJ = c1814780xKG;
        Integer numLJFF = C202500qF.LJFF(c1814780xKG.LLILLL.previewBgColor);
        if (numLJFF != null) {
            int iIntValue = numLJFF.intValue();
            View view = (View) this.LL.getValue();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(iIntValue);
            gradientDrawable.setCornerRadius(C497740JfY.LIZIZ(11.0f));
            view.setBackground(gradientDrawable);
        }
        N5(c1814780xKG);
        I5(c1814780xKG);
        L5(c1814780xKG);
        P5(c1814780xKG);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gxx, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1814780xKG c1814780xKG = (C1814780xKG) interfaceC1891350zJl;
        super.onBindItemView(c1814780xKG, list);
        this.LLJJ = c1814780xKG;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (objLJJJLZIJ instanceof C1828310xg5) {
            C1828310xg5 c1828310xg5 = (C1828310xg5) objLJJJLZIJ;
            if (c1828310xg5.LIZJ) {
                N5(c1814780xKG);
            }
            if (c1828310xg5.LIZIZ) {
                I5(c1814780xKG);
            }
            if (c1828310xg5.LIZ) {
                L5(c1814780xKG);
            }
            if (c1828310xg5.LIZLLL) {
                P5(c1814780xKG);
            }
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
