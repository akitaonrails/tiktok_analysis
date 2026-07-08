package com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.live.view;

import X.C1120704Zx;
import X.C1309620kBU;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1699360uK6;
import X.C1742820vSC;
import X.C1742890vSJ;
import X.C1742910vSL;
import X.C1748170vap;
import X.C1748180vaq;
import X.C1748200vas;
import X.C1748210vat;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C1749730vdL;
import X.C1776220wK4;
import X.C1ACD;
import X.C1AEE;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C426200GnS;
import X.C429820GtI;
import X.C626070Oh3;
import X.C626080Oh4;
import X.C631370Opb;
import X.C723830SaL;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1338240kve;
import X.EnumC2176021AEe;
import X.InterfaceC1748860vbw;
import X.InterfaceC2175541ACi;
import Y.ACListenerS128S0200000_26;
import Y.ACListenerS160S0100000_26;
import Y.ARunnableS104S0100000_4;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.common.ECTrendingBaseReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.live.view.ECTrendingLiveAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ECTrendingLiveAssem extends ECTrendingBaseReusedAssem<ECTrendingLiveAssem, C1742890vSJ> {
    public C1748200vas LLJLIL;
    public C426200GnS LLJLILLLLZIIL;
    public SmartImageView LLJLL;
    public C1AEE LLJLLIL;
    public C429820GtI LLJLLL;
    public C626070Oh3 LLJZ;
    public View LLJZIJLIL;
    public C1742890vSJ LLL;
    public C1748210vat LLLF;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bt0;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1AEE c1aee;
        C1AEE c1aee2 = this.LLJLLIL;
        if (c1aee2 != null) {
            c1aee2.LJIIIZ();
        }
        C1748210vat c1748210vat = this.LLLF;
        if (c1748210vat != null && (c1aee = this.LLJLLIL) != null) {
            c1aee.LJFF(c1748210vat);
        }
        this.LLLF = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        C1AEE c1aee = this.LLJLLIL;
        if (c1aee != null) {
            c1aee.LIZLLL(EnumC2176021AEe.PLAY_SELECTION);
        }
        C626070Oh3 c626070Oh3 = this.LLJZ;
        if (c626070Oh3 != null) {
            c626070Oh3.setMuteIconVisible(false);
        }
    }

    @Override // X.InterfaceC1742830vSD
    public final void LJIILLIIL() {
        play();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live resume： ");
        sbLIZ.append(C631370Opb.LIZIZ(this));
        C2188811AlT.LIZIZ(sbLIZ);
        C1309620kBU.LIZ("ECTrendingLiveAssem");
    }

    @Override // X.InterfaceC1742830vSD
    public final void pause() {
        C1AEE c1aee;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live pause： ");
        sbLIZ.append(C631370Opb.LIZIZ(this));
        C2188811AlT.LIZIZ(sbLIZ);
        C1309620kBU.LIZ("ECTrendingLiveAssem");
        C1748720vbi.LIZLLL(LJJIJL(), new C1748170vap(), new AwS605S0100000_26(this, 285));
        C1AEE c1aee2 = this.LLJLLIL;
        if (c1aee2 != null) {
            C1ACD c1acd = c1aee2.LL;
            if (Intrinsics.LJFF(c1acd != null ? Boolean.valueOf(c1acd.LJJII()) : null, Boolean.TRUE)) {
                C1748210vat c1748210vat = this.LLLF;
                if (c1748210vat != null && (c1aee = this.LLJLLIL) != null) {
                    c1aee.LJFF(c1748210vat);
                }
                C1AEE c1aee3 = this.LLJLLIL;
                if (c1aee3 != null) {
                    c1aee3.LIZLLL(EnumC2176021AEe.PLAY_SELECTION);
                }
            }
        }
        C626070Oh3 c626070Oh3 = this.LLJZ;
        if (c626070Oh3 != null) {
            c626070Oh3.setMuteIconVisible(false);
        }
        C1742890vSJ c1742890vSJ = this.LLL;
        if (c1742890vSJ != null) {
            tp(c1742890vSJ);
        }
    }

    @Override // X.InterfaceC1742830vSD
    public final void play() {
        Aweme aweme;
        LiveRoomStruct liveRoomStructFinally;
        C1AEE c1aee;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live play： ");
        sbLIZ.append(C631370Opb.LIZIZ(this));
        C2188811AlT.LIZIZ(sbLIZ);
        C1309620kBU.LIZ("ECTrendingLiveAssem");
        C626070Oh3 c626070Oh3 = this.LLJZ;
        if (c626070Oh3 != null) {
            c626070Oh3.setMuteIconVisible(true);
        }
        C1748720vbi.LIZLLL(LJJIJL(), new C1748180vaq(), new AwS605S0100000_26(this, 286));
        C1742890vSJ c1742890vSJ = this.LLL;
        if (c1742890vSJ == null || (aweme = c1742890vSJ.LLILLJJLI) == null || (liveRoomStructFinally = AwemeExtKt.getLiveRoomStructFinally(aweme)) == null || (c1aee = this.LLJLLIL) == null) {
            return;
        }
        InterfaceC2175541ACi interfaceC2175541ACi = c1aee.LLILLJJLI;
        if (interfaceC2175541ACi != null) {
            C1120704Zx.LIZ.getClass();
            C1120704Zx.LIZJ = interfaceC2175541ACi;
        }
        C1742820vSC c1742820vSC = op().LL;
        String str = c1742820vSC != null ? c1742820vSC.LJ : null;
        C1742820vSC c1742820vSC2 = op().LL;
        c1aee.setLivePlayerEntranceParam(new C1699360uK6(str, c1742820vSC2 != null ? c1742820vSC2.LJFF : null, null, "ecom", false, true, 8));
        c1aee.LJ(new C1749730vdL(C626080Oh4.LIZIZ, liveRoomStructFinally, c1aee));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0vat, X.1ACi] */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJZIJLIL = view;
        this.LLJLIL = (C1748200vas) view.findViewById(R.id.ghn);
        this.LLJLILLLLZIIL = (C426200GnS) view.findViewById(R.id.yjx);
        this.LLJLL = (SmartImageView) view.findViewById(R.id.yjt);
        this.LLJLLIL = (C1AEE) view.findViewById(R.id.yk9);
        this.LLJLLL = (C429820GtI) view.findViewById(R.id.yke);
        this.LLJZ = (C626070Oh3) view.findViewById(R.id.ykn);
        C1748200vas c1748200vas = this.LLJLIL;
        if (c1748200vas != null) {
            c1748200vas.LLILZ = this;
        }
        ?? r1 = new InterfaceC2175541ACi() { // from class: X.0vat
            @Override // X.InterfaceC2175541ACi
            public final Integer Dk() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean LLILLIZIL() {
                return false;
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Md() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final void T5() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void Th(int i, int i2, View view2) {
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean U1() {
                return true;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean We() {
                return false;
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Y7() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            /* JADX INFO: renamed from: if */
            public final void mo29if(String str) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void o() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void oc(C945320ahu c945320ahu) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void oe(String str) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void sk(String str) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void w9(String str) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLIL() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onTextureRenderDrawFrame ");
                sbLIZ.append(C631370Opb.LIZIZ(this.LL));
                C2188811AlT.LIZIZ(sbLIZ);
                C1309620kBU.LIZ("ECTrendingLiveAssem");
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLLLIL() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("syncOnFirstFrame ");
                sbLIZ.append(C631370Opb.LIZIZ(this.LL));
                C2188811AlT.LIZIZ(sbLIZ);
                C1309620kBU.LIZ("ECTrendingLiveAssem");
            }

            @Override // X.InterfaceC2175541ACi
            public final void v() {
                C1742740vS4.LIZ();
                SmartImageView smartImageView = this.LL.LLJLL;
                if (smartImageView != null) {
                    C786410Ut5.LLFF(8, smartImageView);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFirst Frame ");
                sbLIZ.append(C631370Opb.LIZIZ(this.LL));
                C2188811AlT.LIZIZ(sbLIZ);
                C1309620kBU.LIZ("ECTrendingLiveAssem");
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlayerMessage: ");
                sbLIZ.append(enumC1913550ztZ);
                sbLIZ.append(' ');
                sbLIZ.append(obj);
                sbLIZ.append(' ');
                sbLIZ.append(C631370Opb.LIZIZ(this.LL));
                C2188811AlT.LIZIZ(sbLIZ);
                C1309620kBU.LIZ("ECTrendingLiveAssem");
                int i = C1891690zKJ.LIZ[enumC1913550ztZ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            C1748720vbi.LIZLLL(this.LL.LJJIJL(), new C1748150van(), new AwS605S0100000_26(this.LL, 282));
                            ECTrendingLiveAssem eCTrendingLiveAssem = this.LL;
                            C1742890vSJ c1742890vSJ = eCTrendingLiveAssem.LLL;
                            if (c1742890vSJ != null) {
                                eCTrendingLiveAssem.tp(c1742890vSJ);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ECTrendingLiveAssem eCTrendingLiveAssem2 = this.LL;
                    C1742890vSJ c1742890vSJ2 = eCTrendingLiveAssem2.LLL;
                    if (c1742890vSJ2 == null) {
                        return;
                    }
                    eCTrendingLiveAssem2.tp(c1742890vSJ2);
                    return;
                }
                SmartImageView smartImageView = this.LL.LLJLL;
                if (smartImageView == null) {
                    return;
                }
                C786410Ut5.LLFF(8, smartImageView);
            }
        };
        this.LLLF = r1;
        C1AEE c1aee = this.LLJLLIL;
        if (c1aee != null) {
            c1aee.LLILLJJLI = r1;
            C1120704Zx.LIZ.getClass();
            C1120704Zx.LIZJ = r1;
        }
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0qtU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1742800vSA) obj).LLILZLL);
            }
        }, null, AFwS313S0000000_26.get$arr$(14), 6);
        C723830SaL.LIZ(this, null, new AwS603S0100000_24(this, 65));
        C1748730vbj.LJ(LJJIJL(), new InterfaceC1748860vbw() { // from class: X.0vav
            @Override // X.InterfaceC1748860vbw
            public final void Q3(C1748770vbn c1748770vbn) {
                C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS605S0100000_26(this.LL, 283));
            }
        });
        C2211751BhN.LIZ(view, new C1776220wK4(this, 0));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.common.ECTrendingBaseReusedAssem
    public final void sp(C1742910vSL c1742910vSL) {
        String str;
        C426200GnS c426200GnS;
        String roomTitle;
        String nickname;
        UrlModel avatarThumb;
        C1742890vSJ c1742890vSJ = (C1742890vSJ) c1742910vSL;
        this.LLL = c1742890vSJ;
        View view = this.LLJZIJLIL;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS104S0100000_4(this, 110));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind position： ");
        sbLIZ.append(C631370Opb.LIZIZ(this));
        C2188811AlT.LIZIZ(sbLIZ);
        C1309620kBU.LIZ("bindData");
        Aweme aweme = c1742890vSJ.LLILLJJLI;
        String str2 = null;
        if (aweme != null && AwemeExtKt.getLiveRoomStructFinally(aweme) != null && (c426200GnS = this.LLJLILLLLZIIL) != null) {
            User author = c1742890vSJ.LLILLJJLI.getAuthor();
            if (author != null) {
                roomTitle = author.getRoomTitle();
            } else {
                roomTitle = null;
            }
            User author2 = c1742890vSJ.LLILLJJLI.getAuthor();
            if (author2 != null) {
                nickname = author2.getNickname();
            } else {
                nickname = null;
            }
            User author3 = c1742890vSJ.LLILLJJLI.getAuthor();
            if (author3 != null) {
                avatarThumb = author3.getAvatarThumb();
            } else {
                avatarThumb = null;
            }
            c426200GnS.e0(roomTitle, nickname, avatarThumb, Long.valueOf(c1742890vSJ.LLILZIL), false);
        }
        C429820GtI c429820GtI = this.LLJLLL;
        if (c429820GtI != null) {
            C1742820vSC c1742820vSC = op().LL;
            if (c1742820vSC != null) {
                str = c1742820vSC.LJII;
            } else {
                str = null;
            }
            c429820GtI.setSourceModule(str);
        }
        C429820GtI c429820GtI2 = this.LLJLLL;
        if (c429820GtI2 != null) {
            C1742820vSC c1742820vSC2 = op().LL;
            if (c1742820vSC2 != null) {
                str2 = c1742820vSC2.LJIIIIZZ;
            }
            c429820GtI2.setPageName(str2);
        }
        C429820GtI c429820GtI3 = this.LLJLLL;
        if (c429820GtI3 != null) {
            c429820GtI3.LIZ(c1742890vSJ.LLILZLL, c1742890vSJ.LLILLJJLI, new ACListenerS160S0100000_26(this, 62));
        }
        tp(c1742890vSJ);
        C626070Oh3 c626070Oh3 = this.LLJZ;
        if (c626070Oh3 != null) {
            c626070Oh3.LIZ(c1742890vSJ.LLILZ, false);
        }
        C1748200vas c1748200vas = this.LLJLIL;
        if (c1748200vas != null) {
            C786410Ut5.R9(c1748200vas, new ACListenerS128S0200000_26(this, c1742890vSJ, 23));
        }
    }

    public final void tp(C1742890vSJ c1742890vSJ) {
        UrlModel urlModel;
        String uri;
        LiveRoomStruct liveRoomStructFinally;
        SmartImageView smartImageView = this.LLJLL;
        if (smartImageView != null) {
            C786410Ut5.LLFF(0, smartImageView);
        }
        Aweme aweme = c1742890vSJ.LLILLJJLI;
        List<String> urlList = null;
        if (aweme != null && (liveRoomStructFinally = AwemeExtKt.getLiveRoomStructFinally(aweme)) != null) {
            urlModel = liveRoomStructFinally.roomCover;
        } else {
            urlModel = null;
        }
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        if (urlModel != null) {
            uri = urlModel.getUri();
            urlList = urlModel.getUrlList();
        } else {
            uri = null;
        }
        ImageUrlModel imageUrlModel = new ImageUrlModel(uri, urlList);
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
        c1331670kl3LIZLLL.LJJIJL(getContext());
        c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LIZLLL.LJJ(this.LLJLL);
        C786410Ut5.h3(c1331670kl3LIZLLL);
    }
}
