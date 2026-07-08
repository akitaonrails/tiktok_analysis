package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C1308910kAL;
import X.C1390920mIc;
import X.C13LP;
import X.C15T8;
import X.C15TA;
import X.C15UU;
import X.C15VJ;
import X.C16HF;
import X.C197039127h;
import X.C20097413kK;
import X.C20529215Us;
import X.C20529315Ut;
import X.C20530215Vc;
import X.C20580115fz;
import X.C20581915gH;
import X.C20584715gj;
import X.EnumC1334360kpO;
import Y.ARunnableS0S4102000_11;
import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicStruct;
import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import com.ss.android.ugc.aweme.explore.topic.ExploreRecommendTopicBottomSheetFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtCreationFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class AbS334S0300000_31 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS334S0300000_31 abS334S0300000_31, View view) {
        C20097413kK.LIZ((C20584715gj) abS334S0300000_31.l0);
        HandlerHook.viewPostDelay(((C20580115fz) abS334S0300000_31.l1).LLJJIJI, new ARunnableS131S0100000_31((StoryThoughtAvatarCreationFragment) abS334S0300000_31.l2, 202), 100L);
    }

    public static final void LIZ$1(AbS334S0300000_31 abS334S0300000_31, View view) {
        C20097413kK.LIZ((C20584715gj) abS334S0300000_31.l0);
        HandlerHook.viewPostDelay(((C20581915gH) abS334S0300000_31.l1).LLJI, new ARunnableS131S0100000_31((StoryThoughtCreationFragment) abS334S0300000_31.l2, 204), 100L);
    }

    public static final void LIZ$2(AbS334S0300000_31 abS334S0300000_31, View view) {
        String str;
        String string;
        C15T8 c15t8;
        ExploreTopicAwemeListResponse exploreTopicAwemeListResponseLJI;
        List<Aweme> list;
        List listLL;
        List<Aweme> list2;
        String str2;
        Long l;
        if (view != null && !((C20529215Us) abS334S0300000_31.l0).LLIZ) {
            ((C20529215Us) abS334S0300000_31.l0).LLIZ = true;
            C15TA c15ta = C15TA.LIZ;
            ExploreCustomTopicStruct exploreCustomTopicStructI5 = ((C20529315Ut) abS334S0300000_31.l1).I5();
            String str3 = "";
            if (exploreCustomTopicStructI5 == null || (str = exploreCustomTopicStructI5.topicName) == null) {
                str = "";
            }
            ExploreCustomTopicStruct exploreCustomTopicStructI52 = ((C20529315Ut) abS334S0300000_31.l1).I5();
            if (exploreCustomTopicStructI52 == null || (l = exploreCustomTopicStructI52.topicId) == null || (string = l.toString()) == null) {
                string = "";
            }
            int bindingAdapterPosition = ((C20529315Ut) abS334S0300000_31.l1).getBindingAdapterPosition();
            C20529215Us c20529215Us = (C20529215Us) abS334S0300000_31.l0;
            String str4 = c20529215Us.LLILZIL;
            int i = c20529215Us.LLILZLL;
            Boolean boolValueOf = Boolean.valueOf(c20529215Us.LLILZ);
            ExploreCustomTopicStruct exploreCustomTopicStructI53 = ((C20529315Ut) abS334S0300000_31.l1).I5();
            if (exploreCustomTopicStructI53 != null && (str2 = exploreCustomTopicStructI53.requestId) != null) {
                str3 = str2;
            }
            c15ta.getClass();
            C15TA.LJIILL(new ARunnableS0S4102000_11(string, str, bindingAdapterPosition, str4, i, boolValueOf, str3, 0));
            final ExploreCustomTopicStruct exploreCustomTopicStructI54 = ((C20529315Ut) abS334S0300000_31.l1).I5();
            if (exploreCustomTopicStructI54 == null) {
                ((C20529215Us) abS334S0300000_31.l0).LLIZ = false;
                return;
            }
            if (C20530215Vc.LIZ().isEnable() && C20530215Vc.LIZ().delayPreloadImageWhenClickRecommendCard && (exploreTopicAwemeListResponseLJI = (c15t8 = C15T8.LL).LJI(exploreCustomTopicStructI54.topicId)) != null && (list = exploreTopicAwemeListResponseLJI.items) != null && (!list.isEmpty())) {
                Context context = ((C197039127h) abS334S0300000_31.l2).getContext();
                ExploreTopicAwemeListResponse exploreTopicAwemeListResponseLJI2 = c15t8.LJI(exploreCustomTopicStructI54.topicId);
                if (exploreTopicAwemeListResponseLJI2 != null && (list2 = exploreTopicAwemeListResponseLJI2.items) != null) {
                    listLL = C13LP.LL(list2, 4);
                } else {
                    listLL = null;
                }
                C15VJ.LIZLLL(context, EnumC1334360kpO.HIGH, listLL, C20530215Vc.LIZJ());
            }
            final ExploreRecommendTopicBottomSheetFragment exploreRecommendTopicBottomSheetFragment = new ExploreRecommendTopicBottomSheetFragment(exploreCustomTopicStructI54, ((C20529215Us) abS334S0300000_31.l0).LLILZ, ((C20529315Ut) abS334S0300000_31.l1).getBindingAdapterPosition());
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = exploreRecommendTopicBottomSheetFragment;
            c1390920mIc.LJIIIIZZ(1);
            int i2 = ((C20529315Ut) abS334S0300000_31.l1).LL;
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJL = i2;
            tuxSheet.LLJJIJIIJIL = true;
            C15UU c15uu = C15UU.LIZ;
            Context context2 = ((C197039127h) abS334S0300000_31.l2).getContext();
            c15uu.getClass();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context2);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJI = numLIZJ;
            final C20529215Us c20529215Us2 = (C20529215Us) abS334S0300000_31.l0;
            tuxSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.15Uu
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    c20529215Us2.LLIZ = false;
                    String str5 = TuxSheet._pnsPageId;
                    AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
                    long jElapsedRealtime = 0;
                    if (abstractC343940De4LJIIJJI instanceof C1841980y28) {
                        C15TA c15ta2 = C15TA.LIZ;
                        ExploreCustomTopicStruct exploreCustomTopicStruct = exploreCustomTopicStructI54;
                        final Long l2 = exploreCustomTopicStruct.topicId;
                        final String str6 = exploreCustomTopicStruct.topicName;
                        ExploreRecommendTopicBottomSheetFragment exploreRecommendTopicBottomSheetFragment2 = exploreRecommendTopicBottomSheetFragment;
                        long j = exploreRecommendTopicBottomSheetFragment2.LLJILJILJ;
                        if (exploreRecommendTopicBottomSheetFragment2.LLJILLL > 0) {
                            jElapsedRealtime = SystemClock.elapsedRealtime() - exploreRecommendTopicBottomSheetFragment2.LLJILLL;
                        }
                        final long j2 = j + jElapsedRealtime;
                        final String str7 = exploreCustomTopicStructI54.relatedItemsCount;
                        final String str8 = ((C1841980y28) abstractC343940De4LJIIJJI).LIZ;
                        c15ta2.getClass();
                        C15TA.LJIILL(new Runnable() { // from class: X.0RTg
                            public final void LIZ() {
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
                                c2344009Gk.LJ(l2, "explore_topic_id");
                                C15TA c15ta3 = C15TA.LIZ;
                                String strValueOf = String.valueOf(l2);
                                String str9 = str6;
                                c15ta3.getClass();
                                c2344009Gk.LJIIIIZZ("explore_topic", C15TA.LIZIZ(strValueOf, str9));
                                c2344009Gk.LIZLLL(j2, "duration");
                                c2344009Gk.LJIIIIZZ("post_num", str7);
                                c2344009Gk.LJIIIIZZ("action_type", str8);
                                C20684815ws.LJIILLIIL("ttexp_topic_popup_page_close", c2344009Gk.LIZ);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("ExploreMobUtils@18af.logTopicPageClose$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("ExploreMobUtils@18af.logTopicPageClose$1");
                            }
                        });
                        return;
                    }
                    C15TA c15ta3 = C15TA.LIZ;
                    ExploreCustomTopicStruct exploreCustomTopicStruct2 = exploreCustomTopicStructI54;
                    final Long l3 = exploreCustomTopicStruct2.topicId;
                    final String str9 = exploreCustomTopicStruct2.topicName;
                    ExploreRecommendTopicBottomSheetFragment exploreRecommendTopicBottomSheetFragment3 = exploreRecommendTopicBottomSheetFragment;
                    long j3 = exploreRecommendTopicBottomSheetFragment3.LLJILJILJ;
                    if (exploreRecommendTopicBottomSheetFragment3.LLJILLL > 0) {
                        jElapsedRealtime = SystemClock.elapsedRealtime() - exploreRecommendTopicBottomSheetFragment3.LLJILLL;
                    }
                    final long j4 = j3 + jElapsedRealtime;
                    final String str10 = exploreCustomTopicStructI54.relatedItemsCount;
                    final String str11 = "other";
                    c15ta3.getClass();
                    C15TA.LJIILL(new Runnable() { // from class: X.0RTg
                        public final void LIZ() {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
                            c2344009Gk.LJ(l3, "explore_topic_id");
                            C15TA c15ta32 = C15TA.LIZ;
                            String strValueOf = String.valueOf(l3);
                            String str92 = str9;
                            c15ta32.getClass();
                            c2344009Gk.LJIIIIZZ("explore_topic", C15TA.LIZIZ(strValueOf, str92));
                            c2344009Gk.LIZLLL(j4, "duration");
                            c2344009Gk.LJIIIIZZ("post_num", str10);
                            c2344009Gk.LJIIIIZZ("action_type", str11);
                            C20684815ws.LJIILLIIL("ttexp_topic_popup_page_close", c2344009Gk.LIZ);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ExploreMobUtils@18af.logTopicPageClose$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ExploreMobUtils@18af.logTopicPageClose$1");
                        }
                    });
                }
            };
            tuxSheet2.LL = new C16HF(c20529215Us2, 7);
            tuxSheet2.LLJLILLLLZIIL = false;
            tuxSheet2.LLJLL = true;
            FragmentManager fragmentManager = c20529215Us2.LL;
            if (fragmentManager != null) {
                tuxSheet2.show(fragmentManager, "explore_recommend_topic");
            } else {
                c20529215Us2.LLIZ = false;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS334S0300000_31(C20529215Us c20529215Us, C20529315Ut c20529315Ut, C197039127h c197039127h, int i) {
        super(300L);
        this.$t = i;
        this.l0 = c20529215Us;
        this.l1 = c20529315Ut;
        this.l2 = c197039127h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS334S0300000_31(Object obj, Object obj2, Object obj3, int i) {
        super(600L);
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj;
    }
}
