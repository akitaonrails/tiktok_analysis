package kotlin.jvm.internal;

import X.AbstractC1203190hPp;
import X.C09AY;
import X.C09RD;
import X.C09RE;
import X.C1164120gOo;
import X.C1165730gRP;
import X.C1166810gT9;
import X.C1167390gU5;
import X.C1167410gU7;
import X.C1167470gUD;
import X.C1186500gyu;
import X.C1187980h1I;
import X.C1188040h1O;
import X.C1189620h3w;
import X.C1195690hDj;
import X.C13LP;
import X.C15442062u;
import X.C1558520qew;
import X.C1697810uHb;
import X.C20600815jK;
import X.C291001Au;
import X.C627660Ojc;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel;
import com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostTagAbility;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS102S0201000_18 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS102S0201000_18 awS102S0201000_18, Object obj) {
        C1167470gUD c1167470gUD = (C1167470gUD) obj;
        C1167410gU7 c1167410gU7XQ2 = ((EditPlaylistViewModel) awS102S0201000_18.l0).xQ2();
        c1167410gU7XQ2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        int i2 = 0;
        for (Object obj2 : (ArrayList) c1167410gU7XQ2.LJIILIIL) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                linkedHashMap.put(((Aweme) obj2).getAid(), Integer.valueOf(i3));
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        for (Object obj3 : (ArrayList) c1167410gU7XQ2.LJIIZILJ) {
            int i4 = i + 1;
            if (i >= 0) {
                linkedHashMap.put(((Aweme) obj3).getAid(), Integer.valueOf((c1167410gU7XQ2.LJFF - ((ArrayList) c1167410gU7XQ2.LJIIZILJ).size()) + i + 1));
                i = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C291001Au c291001Au = new C291001Au(linkedHashMap);
        List<Aweme> list = c1167470gUD.LLJJ;
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            if (!c1167470gUD.LLJIJIL.contains(aweme.getAid())) {
                arrayList.add(aweme);
            }
        }
        ((EditPlaylistViewModel) awS102S0201000_18.l0).xQ2().LJIIL = arrayList;
        Set<String> set = c1167470gUD.LLJILJILJ;
        Set<String> set2 = c1167470gUD.LLJIJIL;
        EditPlaylistViewModel editPlaylistViewModel = (EditPlaylistViewModel) awS102S0201000_18.l0;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : set2) {
            if (editPlaylistViewModel.xQ2().LJJ.contains(obj4)) {
                arrayList2.add(obj4);
            }
        }
        Set setLJIIIZ = C15442062u.LJIIIZ(set, arrayList2);
        ((EditPlaylistViewModel) awS102S0201000_18.l0).xQ2().LJIIJJI = C13LP.LLIIII(setLJIIIZ);
        C1167390gU5 c1167390gU5 = (C1167390gU5) awS102S0201000_18.l1;
        return C1167470gUD.LIZ(c1167470gUD, null, null, null, 0L, awS102S0201000_18.i2, c1167390gU5.LIZ, c1167390gU5.LIZIZ, null, null, 0, null, c291001Au, setLJIIIZ, null, arrayList, 10127);
    }

    public static final Object invoke$1(AwS102S0201000_18 awS102S0201000_18, Object obj) {
        MixVideosResponse mixVideosResponse = (MixVideosResponse) awS102S0201000_18.l0;
        List<? extends Aweme> list = mixVideosResponse.mixVideos;
        int i = awS102S0201000_18.i2;
        if (i == 4) {
            MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) awS102S0201000_18.l1;
            mixVideosViewModel.LLIZLLLIL = mixVideosResponse.hasMoreLoadBefore;
            mixVideosViewModel.LLJ = mixVideosResponse.hasMoreLoadMore;
        } else if (i == 1) {
            ((MixVideosViewModel) awS102S0201000_18.l1).LLJ = mixVideosResponse.hasMore;
        }
        MixVideosViewModel mixVideosViewModel2 = (MixVideosViewModel) awS102S0201000_18.l1;
        mixVideosViewModel2.LLJI = mixVideosResponse.minCursor;
        mixVideosViewModel2.LLJIJIL = mixVideosResponse.maxCursor;
        if (list != null) {
            mixVideosViewModel2.setState(new AwS126S0101000_18(list, (List<InterfaceC1891350zJl>) i, 2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS102S0201000_18 awS102S0201000_18, Object obj) {
        List<? extends Aweme> list = ((MixVideosResponse) awS102S0201000_18.l0).mixVideos;
        ArrayList arrayList = new ArrayList();
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) awS102S0201000_18.l1;
        MixVideosResponse mixVideosResponse = (MixVideosResponse) awS102S0201000_18.l0;
        mixVideosViewModel.LLJIJIL = mixVideosResponse.maxCursor;
        mixVideosViewModel.LLJ = mixVideosResponse.hasMore;
        if (list != null) {
            mixVideosViewModel.setState(new AwS45S0301000_18((List) arrayList, (List<Aweme>) list, (List<? extends Aweme>) mixVideosViewModel, (MixVideosViewModel) awS102S0201000_18.i2, 0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS102S0201000_18 awS102S0201000_18, Object obj) {
        C627660Ojc c627660OjcLIZ;
        C1189620h3w c1189620h3w = (C1189620h3w) obj;
        PoiDetailReviewsViewModel poiDetailReviewsViewModel = (PoiDetailReviewsViewModel) awS102S0201000_18.l0;
        C20600815jK<PoiReviewsApi.PoiReviewModel> c20600815jK = poiDetailReviewsViewModel.LLILLJJLI;
        if (c20600815jK != null) {
            c20600815jK.LJIILJJIL(awS102S0201000_18.i2, (PoiReviewsApi.PoiReviewModel) awS102S0201000_18.l1);
            C627660Ojc<PoiReviewsApi.PoiReviewModel> c627660Ojc = c1189620h3w.LL;
            if (c627660Ojc != null) {
                c627660OjcLIZ = C627660Ojc.LIZ(c627660Ojc, null, null, null, c20600815jK.LJII(), 7);
            } else {
                c627660OjcLIZ = null;
            }
            poiDetailReviewsViewModel.setState(new AwS597S0100000_18(c627660OjcLIZ, (C627660Ojc<C1165730gRP>) 834));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS102S0201000_18 awS102S0201000_18, Object obj) {
        C1164120gOo c1164120gOo = (C1164120gOo) obj;
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) awS102S0201000_18.l0;
        List<Aweme> list = c1164120gOo.LL;
        List list2 = (List) awS102S0201000_18.l1;
        mixVideosViewModel.getClass();
        return C1164120gOo.LIZ(c1164120gOo, MixVideosViewModel.vQ2(list, list2), null, null, awS102S0201000_18.i2, false, 0, null, null, new C291001Au(Boolean.TRUE), 502);
    }

    public static final Object invoke$5(AwS102S0201000_18 awS102S0201000_18, Object obj) {
        List<? extends Aweme> list = ((MixVideosResponse) awS102S0201000_18.l0).mixVideos;
        ArrayList arrayList = new ArrayList();
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) awS102S0201000_18.l1;
        MixVideosResponse mixVideosResponse = (MixVideosResponse) awS102S0201000_18.l0;
        mixVideosViewModel.LLJI = mixVideosResponse.minCursor;
        mixVideosViewModel.LLIZLLLIL = mixVideosResponse.hasMore;
        if (list != null) {
            mixVideosViewModel.setState(new AwS45S0301000_18((List) arrayList, (List<Aweme>) list, (List<? extends Aweme>) mixVideosViewModel, (MixVideosViewModel) awS102S0201000_18.i2, 5));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS102S0201000_18 awS102S0201000_18, Object obj) {
        int i = ((C1186500gyu) obj).LLILLJJLI.LIZ;
        int i2 = awS102S0201000_18.i2;
        if (i != i2) {
            ((PoiAlbumViewModel) awS102S0201000_18.l0).setState(new AwS126S0101000_18(i2, (AbstractC1203190hPp) awS102S0201000_18.l1, 4));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS102S0201000_18 awS102S0201000_18, Object obj) {
        IPoiDetailPostTagAbility iPoiDetailPostTagAbility;
        C1195690hDj c1195690hDj;
        C1195690hDj c1195690hDj2;
        View view = (View) obj;
        PoiListApi.PostTag postTag = (PoiListApi.PostTag) awS102S0201000_18.l0;
        if (!view.isSelected()) {
            postTag = null;
        }
        C1188040h1O c1188040h1O = (C1188040h1O) awS102S0201000_18.l1;
        LinearLayout linearLayout = c1188040h1O.LL;
        if (linearLayout != null) {
            Iterator<View> it2 = new C09RD(linearLayout).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (!c09re.hasNext()) {
                    break;
                }
                View view2 = (View) c09re.next();
                if (!Intrinsics.LJFF(view2, view) && (view2 instanceof C1195690hDj) && (c1195690hDj2 = (C1195690hDj) view2) != null) {
                    c1195690hDj2.setSelected(false);
                }
            }
        }
        LinearLayout linearLayout2 = c1188040h1O.LLILLJJLI;
        if (linearLayout2 != null) {
            Iterator<View> it3 = new C09RD(linearLayout2).iterator();
            while (true) {
                C09RE c09re2 = (C09RE) it3;
                if (!c09re2.hasNext()) {
                    break;
                }
                View view3 = (View) c09re2.next();
                if (!Intrinsics.LJFF(view3, view) && (view3 instanceof C1195690hDj) && (c1195690hDj = (C1195690hDj) view3) != null) {
                    c1195690hDj.setSelected(false);
                }
            }
        }
        InterfaceC665370Q7z interfaceC665370Q7z = ((C1188040h1O) awS102S0201000_18.l1).LLILZ;
        if (interfaceC665370Q7z != null && (iPoiDetailPostTagAbility = (IPoiDetailPostTagAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiDetailPostTagAbility.class, null)) != null) {
            iPoiDetailPostTagAbility.lk0(postTag);
        }
        C1187980h1I c1187980h1I = C1187980h1I.LIZ;
        C1188040h1O c1188040h1O2 = (C1188040h1O) awS102S0201000_18.l1;
        InterfaceC665370Q7z interfaceC665370Q7z2 = c1188040h1O2.LLILZ;
        PageFinder pageFinder = c1188040h1O2.LLILZIL;
        String str = ((PoiListApi.PostTag) awS102S0201000_18.l0).tagCode;
        int i = awS102S0201000_18.i2;
        c1187980h1I.getClass();
        C1187980h1I.LIZ(interfaceC665370Q7z2, pageFinder, str, i);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS102S0201000_18 awS102S0201000_18, Object obj) {
        if (!((C1167470gUD) obj).LLJIJIL.contains(((C1166810gT9) awS102S0201000_18.l0).LL)) {
            ((EditPlaylistViewModel) awS102S0201000_18.l1).listSetItemAt(awS102S0201000_18.i2, new C1166810gT9((C1166810gT9) awS102S0201000_18.l0, true));
            ((EditPlaylistViewModel) awS102S0201000_18.l1).setState(new AwS597S0100000_18((C1166810gT9) awS102S0201000_18.l0, 1112));
        } else {
            ((EditPlaylistViewModel) awS102S0201000_18.l1).listSetItemAt(awS102S0201000_18.i2, new C1166810gT9((C1166810gT9) awS102S0201000_18.l0, false));
            ((EditPlaylistViewModel) awS102S0201000_18.l1).setState(new AwS597S0100000_18((C1166810gT9) awS102S0201000_18.l0, 1113));
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS102S0201000_18(int r3, com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse r4, com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 1 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.i2 = r3
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r4
            r1.i2 = r3
            r1.l1 = r5
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS102S0201000_18.<init>(int, com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse, com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S0201000_18(int i, PoiAlbumViewModel poiAlbumViewModel, AbstractC1203190hPp abstractC1203190hPp, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = poiAlbumViewModel;
        this.l1 = abstractC1203190hPp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S0201000_18(C1166810gT9 c1166810gT9, EditPlaylistViewModel editPlaylistViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1166810gT9;
        this.l1 = editPlaylistViewModel;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S0201000_18(EditPlaylistViewModel editPlaylistViewModel, C1167390gU5 c1167390gU5, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = editPlaylistViewModel;
        this.l1 = c1167390gU5;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS102S0201000_18(MixVideosViewModel mixVideosViewModel, MixVideosViewModel mixVideosViewModel2, List<? extends Aweme> list, int i) {
        super(1);
        this.$t = i;
        this.l0 = mixVideosViewModel;
        this.l1 = mixVideosViewModel2;
        this.i2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S0201000_18(PoiListApi.PostTag postTag, C1188040h1O c1188040h1O, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = postTag;
        this.l1 = c1188040h1O;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS102S0201000_18(PoiDetailReviewsViewModel poiDetailReviewsViewModel, int i, PoiReviewsApi.PoiReviewModel poiReviewModel, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = poiDetailReviewsViewModel;
        this.i2 = i;
        this.l1 = poiReviewModel;
    }
}
