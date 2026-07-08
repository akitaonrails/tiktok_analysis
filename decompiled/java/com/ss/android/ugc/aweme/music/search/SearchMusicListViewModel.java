package com.ss.android.ugc.aweme.music.search;

import X.AbstractC316870CbV;
import X.C036E;
import X.C0OE6;
import X.C0XKC;
import X.C1233040iBy;
import X.C1252710ihh;
import X.C13LE;
import X.C14EU;
import X.C15438062q;
import X.C2217381BqS;
import X.C316640Cb8;
import X.C317290CcB;
import X.C447520Hgk;
import X.C615960ODy;
import X.C622680Oba;
import X.C623470Ocr;
import X.C627660Ojc;
import X.C632050Oqh;
import X.C632090Oql;
import X.C632530OrT;
import X.C632540OrU;
import X.C844470XAv;
import X.EnumC631610Opz;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC634010Otr;
import X.InterfaceC736910SvR;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchMusicListViewModel extends AssemListViewModel<C632540OrU, InterfaceC1891350zJl, C632530OrT> {
    public final InterfaceC736910SvR<C0OE6> LL;
    public volatile int LLILLJJLI;
    public final List<MusicGroup> LLILLL = new ArrayList();
    public final Set<String> LLILZ = new LinkedHashSet();
    public String LLILZIL = "";
    public boolean LLILZLL;
    public boolean LLIZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        AssemViewModel.asyncSubscribe$default(this, new C2217381BqS() { // from class: X.0OrS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C632540OrU c632540OrU = (C632540OrU) obj;
                c632540OrU.getClass();
                return C627260Oiy.LIZLLL(c632540OrU);
            }
        }, null, new AwS588S0100000_9(this, 306), new AwS553S0100000_9(this, 1185), new AwS588S0100000_9(this, 307), 2, null);
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C632540OrU(true, 254);
    }

    public final void refresh() {
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                C447520Hgk c447520Hgk = (C447520Hgk) C1252710ihh.LJIIIZ(this, C13LE.LIZ(InterfaceC634010Otr.class));
                if (TextUtils.isEmpty(c447520Hgk != null ? c447520Hgk.LIZ : null)) {
                    return;
                }
                this.LLILZLL = true;
                manualListRefresh();
                setState(AFwS240S0000000_9.get$arr$(502));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C844470XAv.LIZ.getClass();
        C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
        c1233040iBy.LIZIZ(2131837962);
        c1233040iBy.LIZLLL();
        setState(AFwS240S0000000_9.get$arr$(501));
        listClear();
    }

    public final List<C632090Oql> vQ2() {
        EnumC631610Opz enumC631610Opz;
        List<MusicGroup> musicGroups;
        ArrayList arrayList = new ArrayList();
        List<MusicGroup> list = this.LLILLL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (MusicGroup musicGroup : (ArrayList) list) {
            SearchPinnedMusicList searchPinnedMusicListXQ2 = xQ2();
            if (searchPinnedMusicListXQ2 == null || (musicGroups = searchPinnedMusicListXQ2.getMusicGroups()) == null) {
                enumC631610Opz = EnumC631610Opz.ENABLE_PINNED;
            } else {
                Iterator<MusicGroup> it2 = musicGroups.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().getId(), musicGroup.getId())) {
                        enumC631610Opz = EnumC631610Opz.PINNED;
                        break;
                    }
                }
                enumC631610Opz = EnumC631610Opz.ENABLE_PINNED;
            }
            SearchPinnedMusicList searchPinnedMusicListXQ22 = xQ2();
            boolean zLJFF = Intrinsics.LJFF(searchPinnedMusicListXQ22 != null ? searchPinnedMusicListXQ22.getHighlightedGroup() : null, musicGroup);
            SearchPinnedMusicList searchPinnedMusicListXQ23 = xQ2();
            boolean zLJFF2 = Intrinsics.LJFF(searchPinnedMusicListXQ23 != null ? searchPinnedMusicListXQ23.getSpotlightGroup() : null, musicGroup);
            boolean z = !this.LLILZ.contains(musicGroup.getId());
            C632090Oql c632090OqlLJ = C632050Oqh.LJ(musicGroup, enumC631610Opz, Boolean.valueOf(zLJFF), Boolean.valueOf(z), null, null, Boolean.valueOf(zLJFF2), null);
            if (c632090OqlLJ != null) {
                arrayList.add(c632090OqlLJ);
            }
            if (z) {
                arrayList.addAll(C632050Oqh.LJIIJ(musicGroup, Boolean.valueOf(zLJFF), null));
            }
            arrayList2.add(Unit.LIZ);
        }
        return arrayList;
    }

    public final SearchPinnedMusicList xQ2() {
        C447520Hgk c447520Hgk = (C447520Hgk) C1252710ihh.LJIIIZ(this, C13LE.LIZ(InterfaceC634010Otr.class));
        if (c447520Hgk != null) {
            return c447520Hgk.LIZJ;
        }
        return null;
    }

    public final String yQ2() {
        C447520Hgk c447520Hgk = (C447520Hgk) C1252710ihh.LJIIIZ(this, C13LE.LIZ(InterfaceC634010Otr.class));
        if (c447520Hgk != null) {
            return c447520Hgk.LIZIZ;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C622680Oba.LIZLLL(this);
    }

    public SearchMusicListViewModel(C615960ODy c615960ODy) {
        this.LL = c615960ODy;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 305));
    }

    @C14EU
    public final void onAntiCrawlerEvent(C0XKC c0xkc) {
        String str = c0xkc.LIZ;
        if (str != null && a0.LJJIIZI(str, "/aweme/v1/original/music/list/?", false)) {
            EventBus.LIZLLL().LIZIZ(c0xkc);
            refresh();
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C632530OrT>> interfaceC1364105Vn) {
        this.LLILLJJLI++;
        return zQ2(new C632530OrT(yQ2(), this.LLILLJJLI, this.LLILZIL), interfaceC1364105Vn);
    }

    public final Music wQ2(MusicModel musicModel) {
        Music musicConvertToMusic = musicModel.convertToMusic();
        musicConvertToMusic.setDuration(musicConvertToMusic.getDuration() / LSPassThroughRecordSizeConfig.DEFAULT);
        musicConvertToMusic.setShootDuration(Integer.valueOf(musicConvertToMusic.getShootDuration() / LSPassThroughRecordSizeConfig.DEFAULT));
        musicConvertToMusic.setAuditionDuration(Integer.valueOf(musicConvertToMusic.getAuditionDuration() / LSPassThroughRecordSizeConfig.DEFAULT));
        return musicConvertToMusic;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C632530OrT c632530OrT, InterfaceC1364105Vn<? super AbstractC316870CbV<C632530OrT>> interfaceC1364105Vn) {
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        List<C632090Oql> listVQ2 = vQ2();
        c317290CcB.getClass();
        return new C316640Cb8(listVQ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(X.C632530OrT r7, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C632530OrT>> r8) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel.zQ2(X.0OrT, X.05Vn):java.lang.Object");
    }
}
