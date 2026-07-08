package com.ss.android.ugc.aweme.relation.fragment.muflist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C07NC;
import X.C0BLP;
import X.C0I0B;
import X.C0NYY;
import X.C0O26;
import X.C0OFY;
import X.C0OFZ;
import X.C0S1B;
import X.C0ZE7;
import X.C0ZE8;
import X.C0ZEG;
import X.C1247690iZb;
import X.C1253000iiA;
import X.C1260960iv0;
import X.C1262410ixL;
import X.C1263820izc;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1336205Ku;
import X.C1383370m6R;
import X.C1387050mCN;
import X.C1393060mM4;
import X.C1393100mM8;
import X.C1393260mMO;
import X.C13LE;
import X.C1400340mXo;
import X.C1589640rT8;
import X.C1602160rnK;
import X.C1607280rva;
import X.C1607310rvd;
import X.C1608750rxx;
import X.C19719912Dl;
import X.C19727912Gn;
import X.C19ME;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C337180DJs;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427660Gpo;
import X.C431260Gvc;
import X.C438710HIf;
import X.C444940Hca;
import X.C452070Ho5;
import X.C452080Ho6;
import X.C452501pT;
import X.C595660NXw;
import X.C595710NYb;
import X.C724750Sbp;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C894700Z8a;
import X.C896480ZEw;
import X.C897370ZIh;
import X.C897520ZIw;
import X.EnumC1387060mCO;
import X.EnumC1393270mMP;
import X.EnumC1606090rtf;
import X.EnumC1910440zoY;
import X.EnumC323250Cln;
import X.EnumC896490ZEx;
import X.InterfaceC1264300j0O;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC897380ZIi;
import X.InterfaceC898240ZLq;
import Y.ACListenerS124S0200000_21;
import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.profile.model.LatestUnreadVideoInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import com.zhiliaoapp.musically.R;
import irm.AkS58S0200000_19;
import irm.AkS59S0200000_21;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS265S0300000_21;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class MufUserCell extends PowerCell<C1247690iZb> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 755));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 779));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 757));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 783));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 781));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 764));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 769));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 758));
    public C19727912Gn LLJ;
    public final AssemVMLazy LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public EnumC896490ZEx LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final String LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MufUserCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/relation/fragment/muflist/MufListPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MufUserCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MufListPageViewModel.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 787);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(213);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 767), awS565S0100000_21, AFwS209S0000000_21.get$arr$(309), new AwS565S0100000_21((C03K6) this, 770), new AwS565S0100000_21((C03K6) this, 772), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 774), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 776), null, new AwS565S0100000_21((C03K6) this, 777));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21((C03K6) this, 771);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 773);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ, 775);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS565S0100000_212, 52));
            AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(c01gwLIZIZ, 778);
            AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(c01gwLIZIZ, 780);
            AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(c01gwLIZIZ, 782);
            AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(c01gwLIZIZ, 784);
            AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(c01gwLIZIZ, 785);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_214, awS565S0100000_21, new C452080Ho6(), awS565S0100000_215, awS565S0100000_216, awS565S0100000_213, aFwS259S0000000_21, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 786), awS565S0100000_21, AFwS209S0000000_21.get$arr$(310), new AwS565S0100000_21((C03K6) this, 749), new AwS565S0100000_21((C03K6) this, 750), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 751), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 752), null, new AwS565S0100000_21((C03K6) this, 754));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 756), awS565S0100000_21, AFwS209S0000000_21.get$arr$(308), new AwS565S0100000_21((C03K6) this, 759), new AwS565S0100000_21((C03K6) this, 761), new AwS565S0100000_21((C03K6) this, 763), aFwS259S0000000_21, null, null, new AwS565S0100000_21((C03K6) this, 765));
        }
        this.LLJI = assemVMLazy;
        this.LLJILJILJ = EnumC896490ZEx.NO_STATUS;
        this.LLJILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 753));
        this.LLJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 760));
        this.LLJJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 766));
        this.LLJJIII = C452501pT.LIZIZ(new AwS565S0100000_21(this, 762));
        this.LLJJIJI = "friend_tab";
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 768));
    }

    public final TuxIconView N5() {
        return (TuxIconView) this.LLILLL.getValue();
    }

    public final RelationButton P5() {
        return (RelationButton) this.LLILZLL.getValue();
    }

    public final TuxTag R5() {
        return (TuxTag) this.LLILZIL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C19ME c19me;
        super.onItemViewCreated();
        C07NC.LIZ.getClass();
        if (C07NC.LIZIZ()) {
            final TuxTag tuxTagR5 = R5();
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            HandlerHook.viewPost((View) tuxTagR5.getParent(), new Runnable() { // from class: X.0DWZ
                public final /* synthetic */ int LLILLJJLI = 0;
                public final /* synthetic */ int LLILZ = 0;

                public final void LIZ() {
                    Rect rect = new Rect();
                    tuxTagR5.setEnabled(true);
                    tuxTagR5.getHitRect(rect);
                    rect.top -= this.LLILLJJLI;
                    rect.bottom += iLIZIZ;
                    rect.left -= this.LLILZ;
                    rect.right += iLIZIZ2;
                    TouchDelegate touchDelegate = new TouchDelegate(rect, tuxTagR5);
                    if (View.class.isInstance(tuxTagR5.getParent())) {
                        ((View) tuxTagR5.getParent()).setTouchDelegate(touchDelegate);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MufUserCell@4ff4.expandViewTouchDelegate$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MufUserCell@4ff4.expandViewTouchDelegate$1");
                }
            });
        }
        if (!C0BLP.LIZIZ) {
            AssemVMLazy assemVMLazy = this.LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
            C897520ZIw c897520ZIw = ((MufListPageViewModel) assemVMLazy.getValue()).LLILLL;
            if (c897520ZIw != null) {
                c897520ZIw.LIZIZ(true, new C0NYY() { // from class: X.0iZV
                    @Override // X.C0NYY
                    public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                        User user;
                        String uid;
                        C1247690iZb item = this.LL.getItem();
                        if (item != null && (user = item.LL) != null && (uid = user.getUid()) != null) {
                            C595660NXw c595660NXw = map.get(uid);
                            if (c595660NXw == null) {
                                return Unit.LIZ;
                            }
                            this.LL.V5(c595660NXw);
                            return Unit.LIZ;
                        }
                        return Unit.LIZ;
                    }
                });
                return;
            }
            return;
        }
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLJILLL.getValue();
        C1608750rxx config = avatarComponentView.getConfig();
        EnumC1606090rtf enumC1606090rtf = EnumC1606090rtf.MUF_CARD;
        AssemVMLazy assemVMLazy2 = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJIJIL;
        C897520ZIw c897520ZIw2 = ((MufListPageViewModel) assemVMLazy2.getValue()).LLILLL;
        C0ZE7 c0ze7 = new C0ZE7(getCurrentLifecycleOwner());
        c0ze7.LIZIZ(EnumC1910440zoY.FRIEND_LIST);
        config.LIZJ(new C1607280rva(new C1607310rvd(enumC1606090rtf, c0ze7, false, false, c897520ZIw2, 110)));
        avatarComponentView.LJFF(avatarComponentView.getConfig());
        C786410Ut5.g((AvatarComponentView) this.LLJILLL.getValue(), 0);
        ViewGroup.LayoutParams layoutParams = ((View) this.LLJJ.getValue()).getLayoutParams();
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            c19me.startToEnd = R.id.bi1;
        }
        C786410Ut5.LLLLLJIL((C427660Gpo) this.LL.getValue(), 8);
        View view = (View) this.LLIZ.getValue();
        int visibility = view.getVisibility();
        view.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, view);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        String str;
        super.onViewAttachedToWindow();
        C1247690iZb item = getItem();
        if (item != null) {
            String uid = item.LL.getUid();
            ArrayList arrayList = (ArrayList) C1263820izc.LIZ;
            if (arrayList.contains(uid)) {
                return;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            MufPageTrackInfo mufPageTrackInfo = item.LLILLL;
            String str2 = mufPageTrackInfo != null ? mufPageTrackInfo.enterFrom : null;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            MufPageTrackInfo mufPageTrackInfo2 = item.LLILLL;
            if (mufPageTrackInfo2 != null && (str = mufPageTrackInfo2.previousPage) != null) {
                str3 = str;
            }
            c2344009Gk.LJIIIIZZ("previous_page", str3);
            c2344009Gk.LIZJ(getLayoutPosition() + 1, "impr_order");
            c2344009Gk.LIZJ(this.LLJILJIL ? 1 : 0, "is_online");
            c2344009Gk.LIZJ(this.LLJIJIL ? 1 : 0, "has_new_videos_link");
            c2344009Gk.LIZJ(item.LLILZ ? 1 : 0, "is_highlight");
            LatestUnreadVideoInfo latestUnreadVideoInfo = item.LL.getLatestUnreadVideoInfo();
            if (latestUnreadVideoInfo != null) {
                Integer numValueOf = Integer.valueOf(latestUnreadVideoInfo.getTotalUnread());
                if (numValueOf.intValue() > 0) {
                    c2344009Gk.LIZJ(numValueOf.intValue(), "new_videos_cnt");
                }
            }
            C20684815ws.LJIILLIIL("show_mutual_friend_cell", c2344009Gk.LIZ);
            arrayList.add(uid);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        C1589640rT8.LIZIZ.H2((C1393060mM4) this.LLJJIII.getValue());
    }

    public final void U5(boolean z) {
        User user;
        String uid;
        C1247690iZb item = getItem();
        if (item != null && (user = item.LL) != null && (uid = user.getUid()) != null) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            C897370ZIh.LIZ().LJIIJJI();
            C0ZE7 c0ze7 = new C0ZE7(getCurrentLifecycleOwner());
            c0ze7.LIZIZ(EnumC1910440zoY.FRIEND_LIST);
            c0ze7.LJII = Boolean.valueOf(z);
            c0ze7.LIZJ = uid;
            C0ZE8.LJIIIZ(c0ze7);
        }
    }

    public final void V5(C595660NXw c595660NXw) {
        C894700Z8a c894700Z8aLIZ = C896480ZEw.LIZ(c595660NXw, this.itemView.getContext(), 2);
        this.LLJILJILJ = c894700Z8aLIZ.LIZIZ;
        boolean zLIZJ = C896480ZEw.LIZJ(c595660NXw);
        this.LLJILJIL = zLIZJ;
        if (zLIZJ) {
            C19727912Gn c19727912Gn = this.LLJ;
            if (c19727912Gn != null) {
                c19727912Gn.setActive(true);
            }
            C19727912Gn c19727912Gn2 = this.LLJ;
            if (c19727912Gn2 != null) {
                C786410Ut5.d0(c19727912Gn2, 0);
            }
            U5(true);
        } else {
            C19727912Gn c19727912Gn3 = this.LLJ;
            if (c19727912Gn3 != null) {
                C786410Ut5.d0(c19727912Gn3, 8);
            }
            U5(false);
        }
        if (c894700Z8aLIZ.LIZIZ != EnumC896490ZEx.NO_STATUS) {
            ((TextView) this.LLILZ.getValue()).setText(c894700Z8aLIZ.LIZ);
            C786410Ut5.LLLLZLL((TuxTextView) this.LLILZ.getValue(), 0);
            C786410Ut5.LLZLLIL(R5(), 8);
        } else {
            C786410Ut5.LLLLZLL((TuxTextView) this.LLILZ.getValue(), 8);
            if (!this.LLJIJIL) {
                return;
            }
            C786410Ut5.LLZLLIL(R5(), 0);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String strLIZIZ;
        String strLIZIZ2;
        EnumC323250Cln enumC323250Cln;
        String strLJJLIIIJJI;
        InterfaceC898240ZLq interfaceC898240ZLqInvoke;
        C1260960iv0 c1260960iv0;
        String str;
        C1247690iZb c1247690iZb = (C1247690iZb) interfaceC1891350zJl;
        super.onBindItemView(c1247690iZb);
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        InterfaceC1264300j0O interfaceC1264300j0OZQ2 = ((MufListPageViewModel) assemVMLazy.getValue()).zQ2();
        if (interfaceC1264300j0OZQ2 != null) {
            interfaceC1264300j0OZQ2.kz();
        }
        C786410Ut5.LLLLZLL((TuxTextView) this.LLILZ.getValue(), 8);
        C19727912Gn c19727912Gn = this.LLJ;
        if (c19727912Gn != null) {
            C786410Ut5.d0(c19727912Gn, 8);
        }
        C595710NYb c595710NYbLIZJ = C0O26.LIZJ(AFwS257S0000000_19.get$arr$(706), getItem());
        InterfaceC897380ZIi.LIZIZ.getClass();
        V5(C897370ZIh.LIZ().LIZIZ(c595710NYbLIZJ));
        ((TextView) this.LLILLJJLI.getValue()).setText(c1247690iZb.LLILZIL);
        P5().setTracker(new AwS420S0200000_19(this, c1247690iZb, 172));
        C786410Ut5.I7(new ACListenerS124S0200000_21(this, c1247690iZb, 21), this.itemView);
        if (C1253000iiA.LIZ()) {
            View view = (View) this.LLIZLLLIL.getValue();
            if (view != null) {
                C786410Ut5.I7(new AkS58S0200000_19(this, c1247690iZb, 7), view);
            }
        } else {
            View view2 = (View) this.LLIZLLLIL.getValue();
            if (view2 != null) {
                C786410Ut5.I7(new AkS59S0200000_21(c1247690iZb, this, 7), view2);
            }
        }
        if (c1247690iZb.LLIZ) {
            I5(c1247690iZb, P5());
            this.itemView.setBackground(null);
        } else {
            C1247690iZb item = getItem();
            if (item != null && item.LLILZ) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, this.itemView.getContext());
                if (numLIZJ != null) {
                    this.itemView.setBackgroundColor(numLIZJ.intValue());
                }
            } else {
                this.itemView.setBackgroundResource(((Number) this.LLJJI.getValue()).intValue());
            }
            if (C1336205Ku.LIZ(false).getImSayHiService().LJ(c1247690iZb.LL.getUid(), true, null, !C1336205Ku.LIZ(false).getLightInteractService().LIZLLL(r7), false) && ((C0ZEG) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJJLIIIJJIZ() && (strLJJLIIIJJI = ((C0ZEG) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJJLIIIJJI(this.LLJJIJI)) != null) {
                Function0<InterfaceC898240ZLq> tracker = P5().getTracker();
                if (tracker != null) {
                    interfaceC898240ZLqInvoke = tracker.invoke();
                } else {
                    interfaceC898240ZLqInvoke = null;
                }
                if (interfaceC898240ZLqInvoke instanceof C1260960iv0) {
                    c1260960iv0 = (C1260960iv0) interfaceC898240ZLqInvoke;
                } else {
                    c1260960iv0 = null;
                }
                C0ZEG c0zeg = (C0ZEG) ServiceManager.get().getService(ILightInteractionPlatformService.class);
                String uid = c1247690iZb.LL.getUid();
                RelationButton relationButtonP5 = P5();
                Pair[] pairArr = new Pair[2];
                if (c1260960iv0 != null) {
                    str = c1260960iv0.LIZIZ;
                } else {
                    str = null;
                }
                pairArr[0] = new Pair("enter_from", str);
                pairArr[1] = new Pair("enter_method", "friends_list");
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                String str2 = this.LLJJIJI;
                User user = c1247690iZb.LL;
                AwS422S0200000_21 awS422S0200000_21 = new AwS422S0200000_21(this, c1247690iZb, 100);
                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                if (!c0zeg.LJJIZ(uid, relationButtonP5, strLJJLIIIJJI, mapLJIIIIZZ, str2, user, curUserId, false, null, null, null, null, awS422S0200000_21)) {
                    I5(c1247690iZb, P5());
                }
            } else {
                I5(c1247690iZb, P5());
            }
            P5().getListener().setFollowClickInterceptor(new C1393260mMO(this, c1247690iZb, null));
            this.LLJIJIL = false;
            LatestUnreadVideoInfo latestUnreadVideoInfo = c1247690iZb.LL.getLatestUnreadVideoInfo();
            if (latestUnreadVideoInfo != null && latestUnreadVideoInfo.getTotalUnread() > 0 && latestUnreadVideoInfo.getFirstAweme() != null) {
                C07NC.LIZ.getClass();
                String strValueOf = "10+";
                if (C07NC.LIZIZ()) {
                    LatestUnreadVideoInfo latestUnreadVideoInfo2 = c1247690iZb.LL.getLatestUnreadVideoInfo();
                    if (latestUnreadVideoInfo2 != null) {
                        R5().setMovementMethod(C431260Gvc.LIZ);
                        if (latestUnreadVideoInfo2.getTotalUnread() <= 10) {
                            strValueOf = String.valueOf(latestUnreadVideoInfo2.getTotalUnread());
                        }
                        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
                        if (currentLifecycleOwner != null) {
                            try {
                                strLIZIZ2 = R5().getContext().getResources().getQuantityString(2131755390, latestUnreadVideoInfo2.getTotalUnread(), strValueOf);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strValueOf);
                                sbLIZ.append(" new posts");
                                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                            }
                            User user2 = c1247690iZb.LL;
                            int i = C1262410ixL.LIZ[c1247690iZb.LLILLJJLI.ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    enumC323250Cln = EnumC323250Cln.UNKNOWN;
                                } else {
                                    enumC323250Cln = EnumC323250Cln.RELATION_PAGE_FRIENDS_LIST_TAB;
                                }
                            } else {
                                enumC323250Cln = EnumC323250Cln.INBOX_NEW_FOLLOWER_FRIENDS_LIST_TAB;
                            }
                            new C736950SvV(C13LE.LIZ(FriendNewVideoSharedVM.class), new AwS546S0100000_2(user2, 772), new C452070Ho5(), C724750Sbp.LJII(currentLifecycleOwner), new AwS405S0200000_4(user2, enumC323250Cln, 23), AFwS232S0000000_4.get$arr$(221), null, null, null).getValue();
                            R5().setTextColorRes(R.attr.a1k);
                            TuxTag tuxTagR5 = R5();
                            C444940Hca c444940Hca = new C444940Hca();
                            c444940Hca.LIZJ = strLIZIZ2;
                            c444940Hca.LIZIZ(92);
                            c444940Hca.LIZIZ = false;
                            c444940Hca.LIZLLL(3);
                            c444940Hca.LJIIIIZZ = new AwS265S0300000_21(latestUnreadVideoInfo2, this, c1247690iZb, 25);
                            tuxTagR5.setText(c444940Hca.LIZ(R5().getContext()));
                        }
                    }
                } else {
                    LatestUnreadVideoInfo latestUnreadVideoInfo3 = c1247690iZb.LL.getLatestUnreadVideoInfo();
                    if (latestUnreadVideoInfo3 != null) {
                        if (latestUnreadVideoInfo3.getTotalUnread() <= 10) {
                            strValueOf = String.valueOf(latestUnreadVideoInfo3.getTotalUnread());
                        }
                        try {
                            strLIZIZ = R5().getContext().getResources().getQuantityString(2131755390, latestUnreadVideoInfo3.getTotalUnread(), strValueOf);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strValueOf);
                            sbLIZ2.append(" new posts");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        R5().setTextColorRes(R.attr.a1k);
                        R5().setText(strLIZIZ);
                    }
                }
                if (((View) this.LLILZ.getValue()).getVisibility() == 8) {
                    C786410Ut5.LLZLLIL(R5(), 0);
                    this.LLJIJIL = true;
                }
            } else {
                C786410Ut5.LLZLLIL(R5(), 8);
            }
            C1393100mM8.LJFF(c1247690iZb.LL);
            if (C1393100mM8.LIZIZ(c1247690iZb.LL)) {
                N5().setIconRes(R.raw.icon_eye_slash_fill);
                C337180DJs.LIZJ(N5());
            }
            C1589640rT8.LIZIZ.D2((C1393060mM4) this.LLJJIII.getValue());
        }
        ACListenerS124S0200000_21 aCListenerS124S0200000_21 = new ACListenerS124S0200000_21(this, c1247690iZb, 22);
        if (C0BLP.LIZIZ) {
            ((AvatarComponentView) this.LLJILLL.getValue()).LIZ(1, aCListenerS124S0200000_21);
            User user3 = c1247690iZb.LL;
            UrlModel avatarThumb = user3.getAvatarThumb();
            if (avatarThumb == null && (avatarThumb = c1247690iZb.LL.getAvatarMedium()) == null) {
                avatarThumb = c1247690iZb.LL.getAvatarLarger();
            }
            user3.setAvatarThumb(avatarThumb);
            C0S1B.LIZ((AvatarComponentView) this.LLJILLL.getValue(), c1247690iZb.LL.getUid(), c1247690iZb.LL, this, false, null, 56);
            return;
        }
        C595710NYb c595710NYbLIZJ2 = C0O26.LIZJ(AFwS257S0000000_19.get$arr$(706), getItem());
        InterfaceC897380ZIi.LIZIZ.getClass();
        V5(C897370ZIh.LIZ().LIZIZ(c595710NYbLIZJ2));
        ((View) this.LL.getValue()).setContentDescription(C1383370m6R.LJIIJ(2131823310));
        C786410Ut5.T8((C427660Gpo) this.LL.getValue(), aCListenerS124S0200000_21);
        UrlModel avatarThumb2 = c1247690iZb.LL.getAvatarThumb();
        if (avatarThumb2 == null && (avatarThumb2 = c1247690iZb.LL.getAvatarMedium()) == null && (avatarThumb2 = c1247690iZb.LL.getAvatarLarger()) == null) {
            return;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb2));
        c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LL.getValue());
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
        c1331670kl3LJIIIIZZ.LJJIIZI(c419910GdJ.LIZ(this.itemView.getContext()));
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_color_default_avatar;
        c1331670kl3LJIIIIZZ.LJIL(c419910GdJ2.LIZ(this.itemView.getContext()));
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZ = true;
        c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
        c1331670kl3LJIIIIZZ.LIZLLL = true;
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewLJLLLL;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c_u, viewGroup, false);
        C01GW c01gw = C0BLP.LIZ;
        if (C0BLP.LIZIZ) {
            return viewTd;
        }
        ViewStub viewStub = (ViewStub) viewTd.findViewById(R.id.on8);
        C19727912Gn c19727912Gn = null;
        if (viewStub != null) {
            viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        } else {
            viewLJLLLL = null;
        }
        if (viewLJLLLL instanceof C19727912Gn) {
            c19727912Gn = (C19727912Gn) viewLJLLLL;
        }
        this.LLJ = c19727912Gn;
        if (c19727912Gn != null) {
            c19727912Gn.bringToFront();
        }
        C19727912Gn c19727912Gn2 = this.LLJ;
        if (c19727912Gn2 != null) {
            c19727912Gn2.LIZ(R.attr.c3);
        }
        return viewTd;
    }

    public static void I5(C1247690iZb c1247690iZb, RelationButton relationButton) {
        C1387050mCN c1387050mCN = new C1387050mCN(c1247690iZb.LL);
        c1387050mCN.LJ = EnumC1387060mCO.MESSAGE;
        relationButton.LLLLZIL(c1387050mCN.LIZ());
    }

    public final void S5(C1247690iZb c1247690iZb, EnumC1393270mMP enumC1393270mMP) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        MufPageTrackInfo mufPageTrackInfo = c1247690iZb.LLILLL;
        String str2 = null;
        if (mufPageTrackInfo != null) {
            str2 = mufPageTrackInfo.enterFrom;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        MufPageTrackInfo mufPageTrackInfo2 = c1247690iZb.LLILLL;
        if (mufPageTrackInfo2 != null && (str = mufPageTrackInfo2.previousPage) != null) {
            str3 = str;
        }
        c2344009Gk.LJIIIIZZ("previous_page", str3);
        c2344009Gk.LIZJ(getLayoutPosition() + 1, "impr_order");
        c2344009Gk.LIZJ(this.LLJILJIL ? 1 : 0, "is_online");
        c2344009Gk.LIZJ(this.LLJIJIL ? 1 : 0, "has_new_videos_link");
        c2344009Gk.LJIIIIZZ("click_what", enumC1393270mMP.getValue());
        c2344009Gk.LIZJ(c1247690iZb.LLILZ ? 1 : 0, "is_highlight");
        LatestUnreadVideoInfo latestUnreadVideoInfo = c1247690iZb.LL.getLatestUnreadVideoInfo();
        if (latestUnreadVideoInfo != null) {
            Integer numValueOf = Integer.valueOf(latestUnreadVideoInfo.getTotalUnread());
            if (numValueOf.intValue() > 0) {
                c2344009Gk.LIZJ(numValueOf.intValue(), "new_videos_cnt");
            }
        }
        C20684815ws.LJIILLIIL("click_mutual_friend_cell", c2344009Gk.LIZ);
    }

    public final void T5(C1247690iZb c1247690iZb, EnumC1393270mMP enumC1393270mMP) {
        User user;
        String uid;
        boolean z = this.LLJILJIL;
        C1247690iZb item = getItem();
        if (item != null && (user = item.LL) != null && (uid = user.getUid()) != null) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            C0ZE8 c0ze8LJIIJJI = C897370ZIh.LIZ().LJIIJJI();
            C0ZE7 c0ze7 = new C0ZE7(getCurrentLifecycleOwner());
            c0ze7.LIZIZ(EnumC1910440zoY.FRIEND_LIST);
            c0ze7.LJII = Boolean.valueOf(z);
            c0ze7.LIZJ = uid;
            c0ze8LJIIJJI.LIZ(c0ze7, false, C0I0B.LJFF.LIZIZ());
        }
        S5(c1247690iZb, enumC1393270mMP);
    }

    public final void L5(C1247690iZb c1247690iZb, boolean z, boolean z2) {
        String str;
        View view;
        String str2;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_method", "click_head");
        String uid = c1247690iZb.LL.getUid();
        String str3 = "";
        if (uid == null) {
            uid = "";
        }
        pairArr[1] = new Pair("to_user_id", uid);
        MufPageTrackInfo mufPageTrackInfo = c1247690iZb.LLILLL;
        if (mufPageTrackInfo == null || (str = mufPageTrackInfo.previousPage) == null) {
            str = "";
        }
        pairArr[2] = new Pair("previous_page", str);
        pairArr[3] = new Pair("tab_name", "friends_list");
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (z) {
            mapLJIIJ.put("is_search_scene", 1);
        }
        Context context = this.itemView.getContext();
        MufPageTrackInfo mufPageTrackInfo2 = c1247690iZb.LLILLL;
        if (mufPageTrackInfo2 != null && (str2 = mufPageTrackInfo2.enterFrom) != null) {
            str3 = str2;
        }
        C0OFZ c0ofzLIZJ = new C0OFY(context, str3, c1247690iZb.LL.getUid(), c1247690iZb.LL.getSecUid(), "relation_tab", 4).LIZJ(mapLJIIJ);
        if (z2) {
            view = (View) this.LL.getValue();
        } else {
            view = this.itemView;
        }
        c0ofzLIZJ.LIZIZ(getLayoutPosition(), view);
    }
}
