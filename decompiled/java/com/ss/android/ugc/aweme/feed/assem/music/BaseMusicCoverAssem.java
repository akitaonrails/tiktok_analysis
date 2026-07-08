package com.ss.android.ugc.aweme.feed.assem.music;

import X.C01GW;
import X.C03H5;
import X.C0AH2;
import X.C0OAD;
import X.C0P2B;
import X.C0P2C;
import X.C0P2D;
import X.C1356620lPI;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20642515q3;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C452501pT;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C732110Snh;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS144S0100000_9;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.music.BaseMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.copyrightmute.ISearchCopyrightMuteService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseMusicCoverAssem<RECEIVER extends C03H5> extends BaseCellSlotComponent<RECEIVER> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new C0P2B());
    public final InterfaceC1731706qJ LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseMusicCoverAssem.class, "musicBaseVM", "getMusicBaseVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicBaseVM;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BaseMusicCoverAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoMusicBaseVM.class);
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new C0P2C(c19719912DlLIZ), null, new C0P2D());
    }

    public final VideoMusicBaseVM Bp() {
        return (VideoMusicBaseVM) this.LLJLLL.getValue(this, LLJZ[0]);
    }

    public final ISearchCopyrightMuteService Ep() {
        return (ISearchCopyrightMuteService) this.LLJLLIL.getValue();
    }

    public static boolean Fp(Music music) {
        if (music != null && music.getCoverThumb() != null) {
            UrlModel coverThumb = music.getCoverThumb();
            if (!TextUtils.isEmpty(coverThumb.getUri())) {
                return true;
            }
            List<String> urlList = coverThumb.getUrlList();
            if (urlList != null && !urlList.isEmpty()) {
                Iterator<String> it2 = urlList.iterator();
                while (it2.hasNext()) {
                    if (!TextUtils.isEmpty(it2.next())) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void Ip(ViewGroup viewGroup, Music music) {
        String strLIZ;
        if (viewGroup != null) {
            if (music.isOriginalSound()) {
                String strLJI = C20642515q3.LJI(2131823212);
                String authorName = music.getAuthorName();
                if (authorName == null) {
                    authorName = C20642515q3.LJI(2131823205);
                }
                strLIZ = C1356620lPI.LIZ(strLJI, C2097908Jt.LIZJ(new Pair("username", authorName)));
            } else {
                String strLJI2 = C20642515q3.LJI(2131823211);
                Pair[] pairArr = new Pair[2];
                String musicName = music.getMusicName();
                if (musicName == null) {
                    musicName = C20642515q3.LJI(2131823213);
                }
                pairArr[0] = new Pair("soundTitle", musicName);
                String authorName2 = music.getAuthorName();
                if (authorName2 == null) {
                    authorName2 = C20642515q3.LJI(2131823205);
                }
                pairArr[1] = new Pair("artistName", authorName2);
                strLIZ = C1356620lPI.LIZ(strLJI2, C2097608Jq.LJIIIIZZ(pairArr));
            }
            viewGroup.setContentDescription(strLIZ);
        }
    }

    public final void Gp(View view, final View view2, boolean z, final boolean z2) {
        Object obj;
        PaidContentInfo paidContentInfo;
        PaidContentInfo paidContentInfo2;
        C732110Snh.LJI("music assem, setMusicCoverClickListener");
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (C0OAD.LIZIZ(((VideoItemParams) obj).getAweme())) {
            if (view != null) {
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0P2I
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C1389890mGx c1389890mGx = new C1389890mGx(view3);
                        c1389890mGx.LJIIIZ(2131858174);
                        c1389890mGx.LJIIJJI();
                    }
                }, view);
                return;
            }
            return;
        }
        if (z) {
            if (view == null) {
                return;
            }
            C786410Ut5.I7(new ACListenerS144S0100000_9(this, 3), view);
            return;
        }
        if (((Boolean) C0AH2.LIZ.getValue()).booleanValue()) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            }
            Aweme aweme = ((VideoItemParams) obj2).getAweme();
            if (aweme != null && aweme.isPaidContent && (paidContentInfo = aweme.mPaidContentInfo) != null && Long.valueOf(paidContentInfo.getPaidCollectionId()) != null && ((paidContentInfo2 = aweme.mPaidContentInfo) == null || paidContentInfo2.getPaidCollectionId() != 0)) {
                if (view == null) {
                    return;
                }
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0P2J
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C1389890mGx c1389890mGx = new C1389890mGx(view3);
                        c1389890mGx.LJIIIZ(2131839426);
                        c1389890mGx.LJIIJJI();
                    }
                }, view);
                return;
            }
        }
        if (view == null) {
            return;
        }
        C786410Ut5.I7(new View.OnClickListener(this) { // from class: X.0P2K
            public final /* synthetic */ BaseMusicCoverAssem<C03H5> LL;

            {
                this.LL = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                String authorUid;
                String aid;
                Music music;
                if (!C0OBG.LIZIZ(view3) && !this.LL.Ep().LIZIZ(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme(), ((VideoItemParams) C631370Opb.LIZ(this.LL)).mEventType)) {
                    C1590480rUU c1590480rUU = C1590480rUU.LIZ;
                    View view4 = view2;
                    String str = ((VideoItemParams) C631370Opb.LIZ(this.LL)).mEventType;
                    c1590480rUU.getClass();
                    C1590480rUU.LJ(view4, str, "music");
                    if (z2) {
                        C612110Nzd c612110Nzd = C612110Nzd.LIZ;
                        String str2 = ((VideoItemParams) C631370Opb.LIZ(this.LL)).mEventType;
                        Aweme aweme2 = ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme();
                        String mid = null;
                        if (aweme2 != null) {
                            authorUid = AwemeExtKt.getAuthorUid(aweme2);
                        } else {
                            authorUid = null;
                        }
                        Aweme aweme3 = ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme();
                        if (aweme3 != null) {
                            aid = aweme3.getAid();
                        } else {
                            aid = null;
                        }
                        Aweme aweme4 = ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme();
                        if (aweme4 != null && (music = aweme4.getMusic()) != null) {
                            mid = music.getMid();
                        }
                        c612110Nzd.getClass();
                        C612110Nzd.LIZJ(str2, "click", authorUid, aid, mid);
                        C1618330sDP.LIZIZ.LJ();
                    }
                    this.LL.Bp().DQ2(new C1398450mUl(view3.getContext(), view3.getId(), false, C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(C724240Sb0.LJI(this.LL)), C1589640rT8.LIZIZ.t2(C724240Sb0.LJI(this.LL)), C729510SjV.LJJIJIL(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme()), true, null, null, 3596));
                }
            }
        }, view);
    }
}
