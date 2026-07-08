package com.ss.android.ugc.aweme.upvote.detail.replypanel.list;

import X.AbstractC2211791BhR;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03GK;
import X.C03IJ;
import X.C03K6;
import X.C0NYY;
import X.C0S1B;
import X.C0ZE7;
import X.C10EU;
import X.C1220000hqw;
import X.C123100dR;
import X.C1243240iSQ;
import X.C1308910kAL;
import X.C1355210lN1;
import X.C1357950lRR;
import X.C1357970lRT;
import X.C1358000lRW;
import X.C1358170lRn;
import X.C1358180lRo;
import X.C1358210lRr;
import X.C1358220lRs;
import X.C1358230lRt;
import X.C1358240lRu;
import X.C1358250lRv;
import X.C1358260lRw;
import X.C1358550lSP;
import X.C1358940lT2;
import X.C1359050lTD;
import X.C1360460lVU;
import X.C13LE;
import X.C13LP;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1607280rva;
import X.C1607310rvd;
import X.C1608750rxx;
import X.C1609400rz0;
import X.C1908030zkf;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2211751BhN;
import X.C2215101Bmm;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C298740BnM;
import X.C339190DRl;
import X.C431100GvM;
import X.C452070Ho5;
import X.C452080Ho6;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C737760Swo;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C799570VYd;
import X.C897520ZIw;
import X.C946803n0;
import X.EnumC1358190lRp;
import X.EnumC1606080rte;
import X.EnumC1606090rtf;
import X.EnumC1910440zoY;
import X.EnumC992140bvQ;
import X.InterfaceC1358050lRb;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnLongClickListenerC1401960maQ;
import Y.ARunnableS8S0102000_21;
import Y.ARunnableS90S0200000_21;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostSyncViewModel;
import com.ss.android.ugc.aweme.upvote.detail.repostshare.RepostSharePanel;
import com.zhiliaoapp.musically.R;
import irm.AkS89S0100000_21;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AFwS305S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class BaseRepostCell<T extends C1358220lRs> extends PowerCell<T> {
    public static final C1358000lRW LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public AvatarComponentView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public C1358210lRr LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public final AssemVMLazy LLIZ;
    public final C736950SvV LLIZLLLIL;
    public boolean LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseRepostCell.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/upvote/detail/replypanel/vm/RepostInteractListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJI = new C1358000lRW();
    }

    public abstract Function1<C1609400rz0, Unit> I5();

    public abstract String R5();

    public abstract UpvoteStruct S5();

    public abstract RepostReplyStruct T5();

    public abstract UpvoteStruct d6();

    public BaseRepostCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostInteractListViewModel.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 962);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(257);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 947), awS565S0100000_21, AFwS209S0000000_21.get$arr$(365), new AwS565S0100000_21((C03K6) this, 948), new AwS565S0100000_21((C03K6) this, 950), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 952), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 954), null, new AwS565S0100000_21((C03K6) this, 955));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21((C03K6) this, 949);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 951);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ, 953);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS565S0100000_212, 66));
            AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(c01gwLIZIZ, 956);
            AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(c01gwLIZIZ, 957);
            AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(c01gwLIZIZ, 958);
            AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(c01gwLIZIZ, 959);
            AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(c01gwLIZIZ, 960);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_214, awS565S0100000_21, new C452080Ho6(), awS565S0100000_215, awS565S0100000_216, awS565S0100000_213, aFwS259S0000000_21, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 961), awS565S0100000_21, AFwS209S0000000_21.get$arr$(366), new AwS565S0100000_21((C03K6) this, 963), new AwS565S0100000_21((C03K6) this, 964), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 965), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 966), null, new AwS565S0100000_21((C03K6) this, 967));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 968), awS565S0100000_21, AFwS209S0000000_21.get$arr$(367), new AwS565S0100000_21((C03K6) this, 969), new AwS565S0100000_21((C03K6) this, 970), new AwS565S0100000_21((C03K6) this, 944), aFwS259S0000000_21, null, null, new AwS565S0100000_21((C03K6) this, 945));
        }
        this.LLIZ = assemVMLazy;
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(RepostSyncViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(256), null, null, null);
    }

    public final C0ZE7 U5() {
        String str;
        C1358240lRu c1358240lRu;
        User user;
        C1358260lRw c1358260lRw;
        C0ZE7 c0ze7 = new C0ZE7(this);
        c0ze7.LIZIZ(EnumC1910440zoY.REPOST_PANEL);
        T item = getItem();
        if (item == null || (c1358260lRw = item.LLILZ) == null || (str = c1358260lRw.LIZ) == null) {
            str = "";
        }
        c0ze7.LIZLLL = str;
        c0ze7.LJII = Boolean.valueOf(this.LLJ);
        T item2 = getItem();
        c0ze7.LIZJ = (item2 == null || (c1358240lRu = item2.LLILLL) == null || (user = c1358240lRu.LIZ) == null) ? null : user.getUid();
        c0ze7.LJFF = "profile";
        return c0ze7;
    }

    public final RepostInteractListViewModel V5() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (RepostInteractListViewModel) assemVMLazy.getValue();
    }

    public void W5() {
        this.LL = (AvatarComponentView) this.itemView.findViewById(R.id.t9b);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.username);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.edy);
        if (((Number) C1359050lTD.LIZ.getValue()).intValue() == 1) {
            C1358210lRr c1358210lRr = (C1358210lRr) this.itemView.findViewById(R.id.t_y);
            this.LLILZ = c1358210lRr;
            C339190DRl.LIZLLL(c1358210lRr);
        }
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.xy5);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.t7d);
    }

    public final boolean b6() {
        String str;
        T t;
        C1357970lRT c1357970lRT;
        UpvoteStruct upvoteStruct;
        C1358240lRu c1358240lRu;
        User user;
        C1358240lRu c1358240lRu2;
        User user2;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        String tabName;
        C1358240lRu c1358240lRu3;
        T item = getItem();
        String str2 = null;
        if (((item == null || (c1358240lRu3 = item.LLILLL) == null) ? null : c1358240lRu3.LJII) != EnumC992140bvQ.SUCCESS) {
            return false;
        }
        C1355210lN1 c1355210lN1 = RepostSharePanel.LLJLILLLLZIIL;
        Aweme aweme = V5().LL;
        UpvoteStruct upvoteStructD6 = d6();
        RepostReplyStruct repostReplyStructT5 = T5();
        boolean zFQ2 = V5().FQ2();
        VideoItemParams videoItemParams = V5().LLILLJJLI;
        String str3 = "";
        if (videoItemParams == null || (str = videoItemParams.mEventType) == null) {
            str = "";
        }
        VideoItemParams videoItemParams2 = V5().LLILLJJLI;
        if (videoItemParams2 != null && (baseFeedPageParams = videoItemParams2.baseFeedPageParams) != null && (c2189821An6 = baseFeedPageParams.param) != null && (tabName = c2189821An6.getTabName()) != null) {
            str3 = tabName;
        }
        RepostInteractListViewModel repostInteractListViewModelV5 = V5();
        Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
        c1355210lN1.getClass();
        C1355210lN1.LIZ(aweme, upvoteStructD6, repostReplyStructT5, zFQ2, str, str3, "long_press", repostInteractListViewModelV5, null, null, fragmentLIZ, false);
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        VideoItemParams videoItemParams3 = V5().LLILLJJLI;
        String str4 = videoItemParams3 != null ? videoItemParams3.mEventType : null;
        String strAQ2 = V5().AQ2();
        Aweme aweme2 = V5().LL;
        T item2 = getItem();
        String uid = (item2 == null || (c1358240lRu2 = item2.LLILLL) == null || (user2 = c1358240lRu2.LIZ) == null) ? null : user2.getUid();
        T item3 = getItem();
        Integer numValueOf = (item3 == null || (c1358240lRu = item3.LLILLL) == null || (user = c1358240lRu.LIZ) == null) ? null : Integer.valueOf(C1358170lRn.LIZLLL(user));
        T item4 = getItem();
        String str5 = (!(item4 instanceof C1357970lRT) || (c1357970lRT = (C1357970lRT) item4) == null || (upvoteStruct = c1357970lRT.LLILZIL) == null) ? null : upvoteStruct.upvoteId;
        T item5 = getItem();
        if ((item5 instanceof C1357950lRR) && (t = item5) != null) {
            str2 = t.LL;
        }
        C1358000lRW c1358000lRW = LLJI;
        T item6 = getItem();
        c1358000lRW.getClass();
        C1358550lSP.LJIILIIL(c1358550lSP, str4, strAQ2, aweme2, "long_press", uid, numValueOf, str5, str2, C1358000lRW.LIZ(item6), V5().LLJ, null, 1024);
        return true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        W5();
        C03GK.LIZ(this.itemView, EnumC1358190lRp.CELL, AFwS305S0000000_21.get$arr$(62), 4);
        C786410Ut5.I7(new AkS89S0100000_21(this, 28), this.itemView);
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1401960maQ(this, 4));
        C03GK.LIZ(this.LLILLJJLI, EnumC1358190lRp.USERNAME, null, 12);
        C03GK.LIZ(this.LLILZLL, EnumC1358190lRp.BUTTON, AFwS305S0000000_21.get$arr$(63), 4);
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            C786410Ut5.I7(new AkS89S0100000_21(this, 29), tuxTextView);
        }
        AvatarComponentView avatarComponentView = this.LL;
        if (avatarComponentView != null) {
            C1608750rxx config = avatarComponentView.getConfig();
            config.LIZLLL(new C737760Swo(new C1606750ruj(EnumC1606080rte.REPOST_PANEL, new C1606770rul(null, null, null, null, new AwS565S0100000_21((BaseRepostCell) this, 1296), null, null, null, null, 495), 4)), new C1607280rva(new C1607310rvd(EnumC1606090rtf.REPOST_PANEL, U5(), false, false, (C897520ZIw) V5().LLJILJIL.getValue(), 110)));
            config.LIZ(I5());
            new AwS600S0100000_21(this, 275).invoke(config.LIZJ);
            avatarComponentView.LJFF(avatarComponentView.getConfig());
        }
        AvatarComponentView avatarComponentView2 = this.LL;
        if (avatarComponentView2 != null) {
            C786410Ut5.I7(new AkS89S0100000_21(this, 26), avatarComponentView2);
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            C786410Ut5.I7(new AkS89S0100000_21(this, 27), tuxTextView2);
        }
        C897520ZIw c897520ZIw = (C897520ZIw) V5().LLJILJIL.getValue();
        if (c897520ZIw != null) {
            c897520ZIw.LIZIZ(true, new C0NYY(this) { // from class: X.0lRl
                public final /* synthetic */ BaseRepostCell<C1358220lRs> LL;

                {
                    this.LL = this;
                }

                @Override // X.C0NYY
                public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                    String uid;
                    C1358220lRs item = this.LL.getItem();
                    if (item != null) {
                        User user = item.LLILLL.LIZ;
                        if (user != null) {
                            uid = user.getUid();
                        } else {
                            uid = null;
                        }
                        C595660NXw c595660NXw = map.get(uid);
                        if (c595660NXw != null) {
                            this.LL.LLJ = C896480ZEw.LIZJ(c595660NXw);
                            return Unit.LIZ;
                        }
                    }
                    return Unit.LIZ;
                }
            });
        }
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0lRm
            public Function0<String> LJFF;
            public final C1402200mao LJIIIIZZ;
            public final AFwS209S0000000_21 LJ = AFwS209S0000000_21.get$arr$(473);
            public final float LJI = 0.6f;
            public final int LJII = 500;

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ Map LJII() {
                return null;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZIZ() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final int LIZJ() {
                return this.LJII;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                return this.LJIIIIZZ;
            }

            @Override // X.AbstractC2211791BhR
            public final float LJIIL() {
                return this.LJI;
            }

            {
                this.LJFF = new AwS565S0100000_21((BaseRepostCell) this, 1297);
                this.LJIIIIZZ = new C1402200mao(this, 11);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJFF = function0;
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C1358240lRu c1358240lRu;
        Integer numLIZJ;
        super.onViewAttachedToWindow();
        T item = getItem();
        if (item == null || (c1358240lRu = item.LLILLL) == null || !c1358240lRu.LIZIZ || (numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, this.itemView.getContext())) == null) {
            return;
        }
        int iIntValue = numLIZJ.intValue();
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.uk, this.itemView.getContext());
        if (numLIZJ2 != null) {
            HandlerHook.viewPostDelay(this.itemView, new ARunnableS8S0102000_21(this, iIntValue, numLIZJ2.intValue(), 5), 150L);
        }
    }

    public final void L5(C1358220lRs c1358220lRs) {
        int iIntValue;
        TuxTextView tuxTextView;
        if (c1358220lRs == null) {
            return;
        }
        String str = c1358220lRs.LLILLL.LJ;
        if (C298740BnM.LIZ() && (tuxTextView = this.LLILLL) != null) {
            tuxTextView.setMovementMethod(new C431100GvM(new AwS565S0100000_21((BaseRepostCell) this, 946), new AwS600S0100000_21(this, 180)));
        }
        if (C123100dR.LIZ(str)) {
            TuxTextView tuxTextView2 = this.LLILLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setTuxFont(41);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            List<TextExtraStruct> list = c1358220lRs.LLILLL.LJFF;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ba, this.itemView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            C1358940lT2.LIZ(spannableStringBuilder, list, iIntValue, new InterfaceC1358050lRb(this) { // from class: X.0lRg
                public final /* synthetic */ BaseRepostCell<T> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.InterfaceC1358050lRb
                public final void LIZ(TextExtraStruct textExtraStruct) {
                    String userId;
                    String tabName;
                    BaseFeedPageParams baseFeedPageParams;
                    C2189821An6 c2189821An6;
                    C1358110lRh c1358110lRh = C1358110lRh.LIZ;
                    Activity activityLIZ = C1388190mED.LIZ(this.LIZ.itemView.getContext());
                    String str2 = null;
                    if (textExtraStruct != null) {
                        userId = textExtraStruct.getUserId();
                    } else {
                        userId = null;
                    }
                    UpvoteStruct upvoteStructS5 = this.LIZ.S5();
                    VideoItemParams videoItemParams = this.LIZ.V5().LLILLJJLI;
                    if (videoItemParams != null) {
                        str2 = videoItemParams.mEventType;
                    }
                    VideoItemParams videoItemParams2 = this.LIZ.V5().LLILLJJLI;
                    if (videoItemParams2 == null || (baseFeedPageParams = videoItemParams2.baseFeedPageParams) == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
                        tabName = "";
                    }
                    c1358110lRh.getClass();
                    C1358110lRh.LIZ(activityLIZ, userId, upvoteStructS5, str2, "repost_panel_mention", tabName);
                    this.LIZ.X5("mention");
                }
            });
            TuxTextView tuxTextView3 = this.LLILLL;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 0);
            }
            TuxTextView tuxTextView4 = this.LLILLL;
            if (tuxTextView4 != null) {
                tuxTextView4.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        TuxTextView tuxTextView5 = this.LLILLL;
        if (tuxTextView5 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView5, 8);
    }

    public final void N5(C1358220lRs c1358220lRs) {
        String strLJIIIZ;
        if (c1358220lRs == null) {
            return;
        }
        long j = c1358220lRs.LLILLL.LJI;
        if (j <= 1514736000) {
            strLJIIIZ = "";
        } else {
            strLJIIIZ = C2215101Bmm.LJIIIZ(TimeUnit.SECONDS.toMillis(j));
        }
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            tuxTextView.setText(strLJIIIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046 A[PHI: r1
      0x0046: PHI (r1v5 boolean) = (r1v2 boolean), (r1v6 boolean) binds: [B:22:0x0077, B:9:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(T r8) {
        /*
            r7 = this;
            X.0lRr r3 = r7.LLILZ
            if (r3 == 0) goto L75
            com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel r0 = r7.V5()
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r0.LL
            com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel r0 = r7.V5()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r5 = r0.LLILLJJLI
            com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel r0 = r7.V5()
            java.lang.String r4 = r0.AQ2()
            com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel r0 = r7.V5()
            java.lang.String r2 = r0.LLJ
            X.0SvV r0 = r7.LLIZLLLIL
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostSyncViewModel r1 = (com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostSyncViewModel) r1
            com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel r0 = r7.V5()
            java.lang.String r0 = r0.LLILZLL
            r3.LLJ = r8
            r3.LLJI = r5
            r3.LLJIJIL = r4
            r3.LLJILJIL = r2
            r3.LLJILJILJ = r6
            r3.LLIZ = r1
            r3.LLIZLLLIL = r0
            r2 = 0
            if (r8 == 0) goto L76
            X.0lRu r0 = r8.LLILLL
            if (r0 == 0) goto L76
            boolean r0 = r0.LIZJ
            r1 = 1
            if (r0 != r1) goto L76
        L46:
            X.0lRu r0 = r8.LLILLL
            if (r0 == 0) goto L4c
            int r2 = r0.LIZLLL
        L4c:
            r3.LIZ(r2, r1)
            Y.ACListenerS155S0100000_21 r2 = new Y.ACListenerS155S0100000_21
            r0 = 136(0x88, float:1.9E-43)
            r2.<init>(r3, r0)
            boolean r0 = X.C1848410yCV.LIZ
            if (r0 == 0) goto L60
            avg.f r0 = new avg.f
            r0.<init>(r2)
            r2 = r0
        L60:
            mf.a r1 = new mf.a
            r1.<init>(r2)
            X.1Bky r0 = X.C2213981Bky.LIZIZ
            boolean r0 = r0.isOffline()
            if (r0 == 0) goto L72
            X.1Bhg r0 = X.C2211941Bhg.LIZ
            r0.injectViewListener(r3)
        L72:
            r3.setOnClickListener(r1)
        L75:
            return
        L76:
            r1 = 0
            if (r8 == 0) goto L4c
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell.P5(X.0lRs):void");
    }

    public final void X5(String str) {
        String str2;
        UpvoteStruct upvoteStruct;
        User user;
        C1358240lRu c1358240lRu;
        C1358240lRu c1358240lRu2;
        C1357970lRT c1357970lRT;
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        VideoItemParams videoItemParams = V5().LLILLJJLI;
        String str3 = null;
        if (videoItemParams != null) {
            str2 = videoItemParams.mEventType;
        } else {
            str2 = null;
        }
        String strAQ2 = V5().AQ2();
        T item = getItem();
        if ((item instanceof C1357970lRT) && (c1357970lRT = (C1357970lRT) item) != null) {
            upvoteStruct = c1357970lRT.LLILZIL;
        } else {
            upvoteStruct = null;
        }
        T item2 = getItem();
        if (item2 != null && (c1358240lRu2 = item2.LLILLL) != null) {
            user = c1358240lRu2.LIZ;
        } else {
            user = null;
        }
        T item3 = getItem();
        if (item3 != null && (c1358240lRu = item3.LLILLL) != null) {
            str3 = c1358240lRu.LJ;
        }
        C1358550lSP.LJIILJJIL(c1358550lSP, str2, strAQ2, upvoteStruct, user, str, false, str3, null, null, null, 1792);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: a6, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) {
        int size;
        List<UpvoteStruct> list;
        C897520ZIw c897520ZIw;
        super.onBindItemView(t);
        User user = t.LLILLL.LIZ;
        if (user != null) {
            if (!C10EU.LJIILLIIL(user) && (c897520ZIw = (C897520ZIw) V5().LLJILJIL.getValue()) != null) {
                c897520ZIw.LJ();
            }
            AvatarComponentView avatarComponentView = this.LL;
            if (avatarComponentView != null) {
                String uid = user.getUid();
                if (uid == null) {
                    uid = "";
                }
                C0S1B.LIZ(avatarComponentView, uid, user, this, false, null, 56);
            }
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS90S0200000_21(user, this, 49));
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                C1243240iSQ.LIZ.getClass();
                tuxTextView.setText(C1243240iSQ.LIZ(user, true));
            }
            C1908030zkf.LJI(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.LLILLJJLI);
        }
        P5(t);
        L5(t);
        N5(t);
        if (!C1358230lRt.LJII && C1358230lRt.LIZ != 0) {
            int i = 1;
            C1358230lRt.LJII = true;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1358550lSP c1358550lSP = C1358550lSP.LIZ;
            String str = C1358230lRt.LJIIIIZZ;
            String str2 = C1358230lRt.LJIIIZ;
            if (C1358180lRo.LJ() <= 0) {
                i = 0;
            }
            int iLJ = C1358180lRo.LJ();
            Long lLIZJ = C1358230lRt.LIZJ(C1358230lRt.LIZ, C1358230lRt.LIZIZ);
            Long lLIZJ2 = C1358230lRt.LIZJ(C1358230lRt.LIZIZ, C1358230lRt.LIZJ);
            Long lLIZJ3 = C1358230lRt.LIZJ(C1358230lRt.LIZJ, C1358230lRt.LIZLLL);
            Long lLIZJ4 = C1358230lRt.LIZJ(C1358230lRt.LIZLLL, C1358230lRt.LJ);
            Long lLIZJ5 = C1358230lRt.LIZJ(C1358230lRt.LJ, jCurrentTimeMillis);
            Long lLIZJ6 = C1358230lRt.LIZJ(C1358230lRt.LJFF, C1358230lRt.LJI);
            Long lLIZJ7 = C1358230lRt.LIZJ(C1358230lRt.LIZ, C1358230lRt.LJ);
            Long lLIZJ8 = C1358230lRt.LIZJ(C1358230lRt.LIZ, jCurrentTimeMillis);
            C1360460lVU c1360460lVU = C1360460lVU.LIZIZ;
            String str3 = C1358230lRt.LJIIJ;
            if (str3 == null) {
                str3 = "";
            }
            UpvoteList upvoteListLJIIIIZZ = c1360460lVU.LJIIIIZZ(str3);
            if (upvoteListLJIIIIZZ != null && (list = upvoteListLJIIIIZZ.upvotes) != null) {
                size = list.size();
            } else {
                size = 0;
            }
            Integer numValueOf = Integer.valueOf(size);
            c1358550lSP.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("enter_method", str2);
            c2344009Gk.LIZJ(i, "panel_open_opt_hit");
            c2344009Gk.LIZJ(iLJ, "panel_open_opt_mask");
            c2344009Gk.LJ(numValueOf, "repost_count");
            C1358170lRn.LIZ(c2344009Gk, "click_to_create_view_ms", lLIZJ);
            C1358170lRn.LIZ(c2344009Gk, "container_inflate_ms", lLIZJ2);
            C1358170lRn.LIZ(c2344009Gk, "create_view_to_vc_end_ms", lLIZJ3);
            C1358170lRn.LIZ(c2344009Gk, "vc_end_to_first_frame_ms", lLIZJ4);
            C1358170lRn.LIZ(c2344009Gk, "first_frame_to_content_ms", lLIZJ5);
            C1358170lRn.LIZ(c2344009Gk, "first_cell_inflate_ms", lLIZJ6);
            C1358170lRn.LIZ(c2344009Gk, "click_to_first_frame_ms", lLIZJ7);
            C1358170lRn.LIZ(c2344009Gk, "click_to_content_shown_ms", lLIZJ8);
            C20684815ws.LJIILLIIL("repost_panel_open_chain_perf", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c6(java.lang.String r15) {
        /*
            r14 = this;
            android.view.View r0 = r14.itemView
            androidx.fragment.app.Fragment r0 = X.C946803n0.LIZ(r0)
            if (r0 == 0) goto L6a
            androidx.fragment.app.FragmentManager r2 = r0.getChildFragmentManager()
            if (r2 == 0) goto L6a
            X.0lPT r4 = new X.0lPT
            com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct r5 = r14.T5()
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = r14.S5()
            r10 = 0
            if (r0 == 0) goto L6f
            java.lang.String r6 = r0.upvoteId
        L1d:
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = r14.S5()
            if (r0 == 0) goto L6d
            com.ss.android.ugc.aweme.profile.model.User r7 = r0.user
        L25:
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = r14.S5()
            r3 = 0
            if (r0 == 0) goto L6b
            boolean r0 = X.C1359720lUI.LJ(r0)
            r8 = 1
            if (r0 != r8) goto L6b
        L33:
            com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel r0 = r14.V5()
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r0.LL
            com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel r0 = r14.V5()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = r0.LLILLJJLI
            if (r0 == 0) goto L43
            java.lang.String r10 = r0.mEventType
        L43:
            com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel r0 = r14.V5()
            java.lang.String r12 = r0.LLILZLL
            com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel r0 = r14.V5()
            java.lang.String r13 = r0.AQ2()
            r11 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            long r0 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.upvote.detail.replypanel.assem.RepostReplyKeyboard.LLJJIJI = r0
            com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel r0 = r14.V5()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = r0.LLILLJJLI
            com.ss.android.ugc.aweme.upvote.detail.replypanel.assem.RepostReplyKeyboard r1 = X.C1356720lPS.LIZ(r0, r4, r3)
            java.lang.String r0 = "repost_reply_keyboard"
            r1.show(r2, r0)
        L6a:
            return
        L6b:
            r8 = 0
            goto L33
        L6d:
            r7 = r10
            goto L25
        L6f:
            r6 = r10
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell.c6(java.lang.String):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1358220lRs c1358220lRs = (C1358220lRs) interfaceC1891350zJl;
        super.onBindItemView(c1358220lRs, list);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (objLJJJLZIJ instanceof C1358250lRv) {
            C1358250lRv c1358250lRv = (C1358250lRv) objLJJJLZIJ;
            if (c1358250lRv.LIZ) {
                L5(c1358220lRs);
            }
            if (c1358250lRv.LIZJ) {
                P5(c1358220lRs);
            }
            if (c1358250lRv.LIZIZ) {
                N5(c1358220lRs);
            }
        }
    }
}
