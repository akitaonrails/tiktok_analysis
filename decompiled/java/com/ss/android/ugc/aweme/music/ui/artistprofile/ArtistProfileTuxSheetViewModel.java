package com.ss.android.ugc.aweme.music.ui.artistprofile;

import X.AbstractC316870CbV;
import X.C00XC;
import X.C0KBN;
import X.C0PEM;
import X.C123100dR;
import X.C13BV;
import X.C13LP;
import X.C14EU;
import X.C1559260qg8;
import X.C1637206b4;
import X.C1697810uHb;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C317290CcB;
import X.C325650Cpf;
import X.C486890J7n;
import X.C622680Oba;
import X.C627660Ojc;
import X.C630990Ooz;
import X.C631010Op1;
import X.C631020Op2;
import X.C723600SZy;
import X.C888460YtI;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC497601wk;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.ArtistHonorLabel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.UncertMusicOwnerInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class ArtistProfileTuxSheetViewModel extends AssemListViewModel<C325650Cpf, InterfaceC1891350zJl, Long> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C630990Ooz.class, "hierarchy_data_key"), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325650Cpf(0);
    }

    public final C630990Ooz vQ2() {
        return (C630990Ooz) this.LL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C622680Oba.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C622680Oba.LIZJ(this);
        InterfaceC497601wk assemVMScope = getAssemVMScope();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(assemVMScope, C2107308Nj.LIZ, null, new C1637206b4(this, null), 2);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 92));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        User user;
        List<ITEM> listListGetAll;
        if (c888460YtI != null && (user = c888460YtI.LIZ) != null && (listListGetAll = listGetAll()) != 0) {
            int i = 0;
            for (Object obj : listListGetAll) {
                int i2 = i + 1;
                if (i >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                    if (interfaceC1891350zJl instanceof C631020Op2) {
                        C631020Op2 c631020Op2 = (C631020Op2) interfaceC1891350zJl;
                        if (Intrinsics.LJFF(user.getUid(), c631020Op2.LLILLJJLI)) {
                            listSetItemAt(i, C631020Op2.LIZ(c631020Op2, Integer.valueOf(user.getFollowStatus()), Integer.valueOf(user.getFollowerStatus()), user.isBlock, user.isBlocked(), 127615));
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        boolean z;
        List<UncertMusicOwnerInfo> list;
        List<MusicOwnerInfo> songWriter;
        List<UncertMusicOwnerInfo> uncertSongWriters;
        ArrayList arrayList;
        boolean z2;
        String aid;
        Boolean boolValueOf;
        String str;
        Aweme aweme;
        String aid2;
        Boolean boolValueOf2;
        String str2;
        ArtistHonorLabel artistHonorLabel;
        Aweme aweme2;
        Music music;
        Music music2;
        C630990Ooz c630990OozVQ2 = vQ2();
        if (c630990OozVQ2 != null) {
            z = c630990OozVQ2.LLJ;
        } else {
            z = false;
        }
        C630990Ooz c630990OozVQ22 = vQ2();
        if (c630990OozVQ22 != null) {
            list = c630990OozVQ22.LLILLL;
        } else {
            list = null;
        }
        C630990Ooz c630990OozVQ23 = vQ2();
        if (c630990OozVQ23 != null && (music2 = c630990OozVQ23.LLILLJJLI) != null) {
            songWriter = music2.getSongWriter();
        } else {
            songWriter = null;
        }
        C630990Ooz c630990OozVQ24 = vQ2();
        if (c630990OozVQ24 != null && (music = c630990OozVQ24.LLILLJJLI) != null) {
            uncertSongWriters = music.getUncertSongWriters();
        } else {
            uncertSongWriters = null;
        }
        if (songWriter != null) {
            arrayList = new ArrayList();
            Iterator<MusicOwnerInfo> it2 = songWriter.iterator();
            while (it2.hasNext()) {
                String uid = it2.next().getUid();
                if (uid != null) {
                    arrayList.add(uid);
                }
            }
        } else {
            arrayList = null;
        }
        if ((songWriter == null || songWriter.isEmpty()) && (uncertSongWriters == null || uncertSongWriters.isEmpty())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z) {
            if (!z2 && (list == null || list.isEmpty())) {
                C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                Exception exc = new Exception();
                c317290CcB.getClass();
                return new C316650Cb9(exc);
            }
        } else if (list == null || list.isEmpty()) {
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            Exception exc2 = new Exception();
            c317290CcB2.getClass();
            return new C316650Cb9(exc2);
        }
        ArrayList arrayList2 = new ArrayList();
        if (z && list != null && !list.isEmpty()) {
            arrayList2.add(new C00XC(2131837720));
        }
        if (list != null) {
            for (UncertMusicOwnerInfo uncertMusicOwnerInfo : list) {
                if (C123100dR.LIZ(uncertMusicOwnerInfo.getName())) {
                    arrayList2.add(new C631010Op1(uncertMusicOwnerInfo.getName(), vQ2(), ArtistHonorLabel.ARTIST_HONOR_LABEL_ARTIST));
                } else {
                    C630990Ooz c630990OozVQ25 = vQ2();
                    if (c630990OozVQ25 != null && (aweme2 = c630990OozVQ25.LL) != null) {
                        aid2 = aweme2.getAid();
                    } else {
                        aid2 = null;
                    }
                    String uid2 = uncertMusicOwnerInfo.getUid();
                    String secUid = uncertMusicOwnerInfo.getSecUid();
                    UrlModel avatar = uncertMusicOwnerInfo.getAvatar();
                    String nickName = uncertMusicOwnerInfo.getNickName();
                    boolean verified = uncertMusicOwnerInfo.getVerified();
                    String handle = uncertMusicOwnerInfo.getHandle();
                    Integer followStatus = uncertMusicOwnerInfo.getFollowStatus();
                    Integer followerStatus = uncertMusicOwnerInfo.getFollowerStatus();
                    boolean zIsPrivateAccount = uncertMusicOwnerInfo.isPrivateAccount();
                    boolean zIsBlock = uncertMusicOwnerInfo.isBlock();
                    boolean zIsBlocked = uncertMusicOwnerInfo.isBlocked();
                    Integer status = uncertMusicOwnerInfo.getStatus();
                    C630990Ooz c630990OozVQ26 = vQ2();
                    if (c630990OozVQ26 != null) {
                        boolValueOf2 = Boolean.valueOf(c630990OozVQ26.LLILZLL);
                    } else {
                        boolValueOf2 = null;
                    }
                    if (uncertMusicOwnerInfo.getEnterType() == 1) {
                        str2 = "spotlight";
                    } else {
                        str2 = "musician";
                    }
                    C630990Ooz c630990OozVQ27 = vQ2();
                    if (arrayList != null && C13LP.LJJJJ(uncertMusicOwnerInfo.getUid(), arrayList)) {
                        artistHonorLabel = ArtistHonorLabel.ARTIST_HONOR_LABEL_SONG_WRITER;
                    } else {
                        artistHonorLabel = ArtistHonorLabel.ARTIST_HONOR_LABEL_ARTIST;
                    }
                    arrayList2.add(new C631020Op2(aid2, uid2, secUid, avatar, nickName, verified, handle, followStatus, followerStatus, zIsPrivateAccount, zIsBlock, zIsBlocked, status, boolValueOf2, str2, c630990OozVQ27, artistHonorLabel));
                }
            }
        }
        if (z && z2) {
            arrayList2.add(new C00XC(2131837721));
            if (songWriter != null) {
                for (MusicOwnerInfo musicOwnerInfo : songWriter) {
                    C630990Ooz c630990OozVQ28 = vQ2();
                    if (c630990OozVQ28 != null && (aweme = c630990OozVQ28.LL) != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    String uid3 = musicOwnerInfo.getUid();
                    String secUid2 = musicOwnerInfo.getSecUid();
                    UrlModel avatar2 = musicOwnerInfo.getAvatar();
                    String nickName2 = musicOwnerInfo.getNickName();
                    boolean verified2 = musicOwnerInfo.getVerified();
                    String handle2 = musicOwnerInfo.getHandle();
                    Integer followStatus2 = musicOwnerInfo.getFollowStatus();
                    Integer followerStatus2 = musicOwnerInfo.getFollowerStatus();
                    boolean zIsPrivateAccount2 = musicOwnerInfo.isPrivateAccount();
                    boolean zIsBlock2 = musicOwnerInfo.isBlock();
                    boolean zIsBlocked2 = musicOwnerInfo.isBlocked();
                    Integer status2 = musicOwnerInfo.getStatus();
                    C630990Ooz c630990OozVQ29 = vQ2();
                    if (c630990OozVQ29 != null) {
                        boolValueOf = Boolean.valueOf(c630990OozVQ29.LLILZLL);
                    } else {
                        boolValueOf = null;
                    }
                    if (musicOwnerInfo.getEnterType() == 1) {
                        str = "spotlight";
                    } else {
                        str = "musician";
                    }
                    arrayList2.add(new C631020Op2(aid, uid3, secUid2, avatar2, nickName2, verified2, handle2, followStatus2, followerStatus2, zIsPrivateAccount2, zIsBlock2, zIsBlocked2, status2, boolValueOf, str, vQ2(), ArtistHonorLabel.ARTIST_HONOR_LABEL_SONG_WRITER));
                }
            }
            if (uncertSongWriters != null) {
                Iterator<UncertMusicOwnerInfo> it3 = uncertSongWriters.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new C631010Op1(it3.next().getName(), vQ2(), ArtistHonorLabel.ARTIST_HONOR_LABEL_SONG_WRITER));
                }
            }
        }
        AbstractC316870CbV.LIZ.getClass();
        return new C316640Cb8(arrayList2);
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onUnBlockUserEvent(C486890J7n c486890J7n) {
        User user;
        List<ITEM> listListGetAll;
        if (c486890J7n != null && (user = c486890J7n.LIZ) != null && (listListGetAll = listGetAll()) != 0) {
            int i = 0;
            for (Object obj : listListGetAll) {
                int i2 = i + 1;
                if (i >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                    if (interfaceC1891350zJl instanceof C631020Op2) {
                        C631020Op2 c631020Op2 = (C631020Op2) interfaceC1891350zJl;
                        if (Intrinsics.LJFF(user.getUid(), c631020Op2.LLILLJJLI)) {
                            listSetItemAt(i, C631020Op2.LIZ(c631020Op2, Integer.valueOf(user.getFollowStatus()), Integer.valueOf(user.getFollowerStatus()), user.isBlock, user.isBlocked(), 127615));
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        l.longValue();
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        c317290CcB.getClass();
        return new C316640Cb8(c13bv);
    }
}
