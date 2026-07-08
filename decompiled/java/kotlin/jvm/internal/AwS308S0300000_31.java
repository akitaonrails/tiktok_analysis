package kotlin.jvm.internal;

import X.AbstractC813200VvC;
import X.C09AY;
import X.C150D;
import X.C15J1;
import X.C198H;
import X.C199Y;
import X.C20525915Tl;
import X.C20526015Tm;
import X.C20529615Uw;
import X.C20629915o1;
import X.InterfaceC20630715o9;
import X.InterfaceC214897198d;
import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExploreCardInsertResultStruct;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicStruct;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tools.music.MusicServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes32.dex */
public class AwS308S0300000_31 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS308S0300000_31 awS308S0300000_31, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        C150D c150d = (C150D) obj2;
        if (c150d instanceof C20525915Tl) {
            List<ExploreCardInsertResultStruct> list = ((ExploreAwemeList) awS308S0300000_31.l0).cards;
            ExploreCardInsertResultStruct exploreCardInsertResultStruct = null;
            if (list != null) {
                Iterator<ExploreCardInsertResultStruct> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ExploreCardInsertResultStruct next = it2.next();
                    Long l = next.id;
                    long j = ((C20525915Tl) c150d).LL;
                    if (l != null && l.longValue() == j) {
                        exploreCardInsertResultStruct = next;
                        break;
                    }
                }
                ExploreCardInsertResultStruct exploreCardInsertResultStruct2 = exploreCardInsertResultStruct;
                if (exploreCardInsertResultStruct2 != null) {
                    ExploreCardInsertResultStruct.Companion.getClass();
                    List listLIZJ = C20529615Uw.LIZJ(exploreCardInsertResultStruct2);
                    Set set = (Set) awS308S0300000_31.l2;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listLIZJ) {
                        if (!set.contains(((ExploreCustomTopicStruct) obj3).topicId)) {
                            arrayList.add(obj3);
                        }
                    }
                    if (!arrayList.isEmpty() && arrayList.size() >= 4) {
                        ((ExploreFeedListViewModel) awS308S0300000_31.l1).listSetItemAt(iIntValue, C20525915Tl.LIZ((C20525915Tl) c150d, arrayList));
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS308S0300000_31 awS308S0300000_31, Object obj, Object obj2) {
        Aweme aweme;
        String aid;
        String aid2;
        int iIntValue = ((Number) obj).intValue();
        C150D c150d = (C150D) obj2;
        if (c150d instanceof C20526015Tm) {
            List<ExplorePostItem> list = ((ExploreAwemeList) awS308S0300000_31.l0).items;
            ExplorePostItem explorePostItem = null;
            if (list != null) {
                Iterator<ExplorePostItem> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ExplorePostItem next = it2.next();
                    Aweme aweme2 = next.aweme;
                    if (aweme2 != null) {
                        aid = aweme2.getAid();
                    } else {
                        aid = null;
                    }
                    Aweme aweme3 = ((C20526015Tm) c150d).LL;
                    if (aweme3 != null) {
                        aid2 = aweme3.getAid();
                    } else {
                        aid2 = null;
                    }
                    if (Intrinsics.LJFF(aid, aid2)) {
                        explorePostItem = next;
                        break;
                    }
                }
                ExplorePostItem explorePostItem2 = explorePostItem;
                if (explorePostItem2 != null && (aweme = explorePostItem2.aweme) != null) {
                    IAwemeService iAwemeService = (IAwemeService) awS308S0300000_31.l1;
                    if (iAwemeService != null) {
                        iAwemeService.LLILLL(aweme);
                    }
                    ((ExploreFeedListViewModel) awS308S0300000_31.l2).listSetItemAt(iIntValue, C20526015Tm.LIZ((C20526015Tm) c150d, aweme, false, 131070));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS308S0300000_31 awS308S0300000_31, Object obj, Object obj2) {
        InterfaceC20630715o9 interfaceC20630715o9;
        FragmentManager fragmentManager;
        AbstractC813200VvC abstractC813200VvC = (AbstractC813200VvC) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((ConcurrentHashMap) awS308S0300000_31.l0).put(abstractC813200VvC, Boolean.valueOf(zBooleanValue));
        InterfaceC214897198d interfaceC214897198d = (InterfaceC214897198d) awS308S0300000_31.l1;
        if (interfaceC214897198d != null) {
            C198H c198hLIZLLL = C20629915o1.LIZLLL(interfaceC214897198d);
            if ((c198hLIZLLL instanceof InterfaceC20630715o9) && (interfaceC20630715o9 = (InterfaceC20630715o9) c198hLIZLLL) != null && (fragmentManager = interfaceC20630715o9.getFragmentManager()) != null) {
                fragmentManager.LJZL(abstractC813200VvC, zBooleanValue);
            }
        }
        ((FragmentManager) awS308S0300000_31.l2).LJZL(abstractC813200VvC, zBooleanValue);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS308S0300000_31 awS308S0300000_31, Object obj, Object obj2) {
        MusicServiceImpl musicServiceImpl = (MusicServiceImpl) awS308S0300000_31.l0;
        Function1 function1 = (Function1) awS308S0300000_31.l1;
        Function0 function0 = (Function0) awS308S0300000_31.l2;
        musicServiceImpl.getClass();
        new C15J1(musicServiceImpl, function1, function0).LIZ(((Number) obj).intValue(), (Intent) obj2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS308S0300000_31(IAwemeService iAwemeService, ExploreAwemeList exploreAwemeList, ExploreFeedListViewModel exploreFeedListViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = exploreAwemeList;
        this.l1 = iAwemeService;
        this.l2 = exploreFeedListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS308S0300000_31(ExploreAwemeList exploreAwemeList, ExploreAwemeList exploreAwemeList2, ExploreFeedListViewModel exploreFeedListViewModel, Set<Long> set) {
        super(2);
        this.$t = set;
        this.l0 = exploreAwemeList;
        this.l1 = exploreAwemeList2;
        this.l2 = exploreFeedListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS308S0300000_31(MusicServiceImpl musicServiceImpl, AwS391S0200000_25 awS391S0200000_25, AwS569S0100000_25 awS569S0100000_25, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicServiceImpl;
        this.l1 = awS391S0200000_25;
        this.l2 = awS569S0100000_25;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS308S0300000_31(ConcurrentHashMap concurrentHashMap, C199Y c199y, FragmentManager fragmentManager, int i) {
        super(2);
        this.$t = i;
        this.l0 = concurrentHashMap;
        this.l1 = c199y;
        this.l2 = fragmentManager;
    }
}
