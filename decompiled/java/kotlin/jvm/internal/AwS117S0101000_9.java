package kotlin.jvm.internal;

import X.C09AY;
import X.C0OG4;
import X.C0OGJ;
import X.C0OVT;
import X.C0OYC;
import X.C13LP;
import X.C1440005kM;
import X.C1623606Xi;
import X.C20684815ws;
import X.C20693415yG;
import X.C2188811AlT;
import X.C291001Au;
import X.C607720NsY;
import X.C612580O0y;
import X.C624650Oel;
import X.C626430Ohd;
import X.C629660Omq;
import X.C629770On1;
import X.C630570OoJ;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.detail.vm.FollowInnerFeedVM;
import com.ss.android.ugc.aweme.music.model.CollectMusicResponse;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.assem.story.StoryMusicCoverAssem;
import com.ss.android.ugc.aweme.music.v2.assem.story.StoryMusicIgnoreCopyRightCoverAssem;
import com.ss.android.ugc.aweme.music.v2.panel.MusicItemAssem;
import com.ss.android.ugc.aweme.services.MusicEntranceResult;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS117S0101000_9 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS117S0101000_9 awS117S0101000_9, Object obj) {
        C626430Ohd c626430Ohd = (C626430Ohd) obj;
        float f = c626430Ohd.LL;
        float f2 = c626430Ohd.LLILLJJLI;
        return C626430Ohd.LIZ(c626430Ohd, (((f * f2) - ((TopicReview) awS117S0101000_9.l0).topicRating) + awS117S0101000_9.i1) / f2, 0L, 0L, false, false, null, 62);
    }

    public static final Object invoke$1(AwS117S0101000_9 awS117S0101000_9, Object obj) {
        C0OVT c0ovt = (C0OVT) awS117S0101000_9.l0;
        String str = c0ovt.LIZ;
        String str2 = c0ovt.LIZIZ;
        String str3 = c0ovt.LIZJ;
        String str4 = c0ovt.LIZLLL;
        String str5 = c0ovt.LJ;
        Pair<String, String> pair = c0ovt.LJFF;
        Integer num = c0ovt.LJI;
        String str6 = c0ovt.LJII;
        String str7 = c0ovt.LJIIIIZZ;
        Integer numValueOf = Integer.valueOf(awS117S0101000_9.i1);
        obj.getClass();
        return new C0OVT(str, str2, str3, str4, str5, pair, num, str6, str7, numValueOf);
    }

    public static final Object invoke$10(AwS117S0101000_9 awS117S0101000_9, Object obj) {
        C0OG4 c0og4 = (C0OG4) obj;
        int i = 1;
        if (awS117S0101000_9.i1 != 1) {
            i = 0;
        }
        return C0OG4.LIZ(c0og4, new C1623606Xi(Integer.valueOf(i)), (CollectMusicResponse) awS117S0101000_9.l0, null, 4);
    }

    public static final Object invoke$11(AwS117S0101000_9 awS117S0101000_9, Object obj) {
        MusicEntranceResult musicEntranceResult = (MusicEntranceResult) awS117S0101000_9.l0;
        String str = musicEntranceResult.requestId;
        if (str == null) {
            str = "";
        }
        List arrayList = musicEntranceResult.unreadStoryIds;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        int i = awS117S0101000_9.i1;
        obj.getClass();
        return new C630570OoJ(arrayList, str, i);
    }

    public static final Object invoke$12(AwS117S0101000_9 awS117S0101000_9, Object obj) {
        C607720NsY c607720NsY;
        Integer numValueOf;
        String str = ((C612580O0y) obj).LL;
        if (str != null) {
            ConcurrentHashMap<String, C607720NsY> concurrentHashMapBQ2 = ((FollowInnerFeedVM) awS117S0101000_9.l0).BQ2();
            C607720NsY c607720NsY2 = ((FollowInnerFeedVM) awS117S0101000_9.l0).BQ2().get(str);
            if (c607720NsY2 != null) {
                c607720NsY = C607720NsY.LIZ(c607720NsY2, null, null, false, awS117S0101000_9.i1, 7);
            } else {
                c607720NsY = new C607720NsY(null, null, false, awS117S0101000_9.i1, 7);
            }
            concurrentHashMapBQ2.put(str, c607720NsY);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[recordLastViewPosition] update lastViewPosition = ");
            C607720NsY c607720NsY3 = ((FollowInnerFeedVM) awS117S0101000_9.l0).BQ2().get(str);
            if (c607720NsY3 != null) {
                numValueOf = Integer.valueOf(c607720NsY3.LIZLLL);
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS117S0101000_9 awS117S0101000_9, Object obj) {
        return C0OYC.LIZ((C0OYC) obj, new C1623606Xi(C13LP.LLIIII((List) awS117S0101000_9.l0)), null, new C1623606Xi(Integer.valueOf(awS117S0101000_9.i1)), null, 0L, 26);
    }

    public static final Object invoke$3(AwS117S0101000_9 awS117S0101000_9, Object obj) {
        return C0OYC.LIZ((C0OYC) obj, new C1623606Xi((List) awS117S0101000_9.l0), null, new C1623606Xi(Integer.valueOf(awS117S0101000_9.i1)), new C291001Au(null), 0L, 18);
    }

    public static final Object invoke$4(AwS117S0101000_9 awS117S0101000_9, Object obj) {
        return C0OYC.LIZ((C0OYC) obj, new C1623606Xi(C13LP.LLIIII((List) awS117S0101000_9.l0)), null, new C1623606Xi(Integer.valueOf(awS117S0101000_9.i1)), null, 0L, 26);
    }

    public static final Object invoke$5(AwS117S0101000_9 awS117S0101000_9, Object obj) {
        return C0OYC.LIZ((C0OYC) obj, new C1623606Xi((List) awS117S0101000_9.l0), null, new C1623606Xi(Integer.valueOf(awS117S0101000_9.i1)), null, 0L, 26);
    }

    public static final Object invoke$6(AwS117S0101000_9 awS117S0101000_9, Object obj) {
        long id;
        Music music;
        MusicDetail musicDetailLIZ = ((C629660Omq) obj).LL.LIZ();
        if (musicDetailLIZ != null && (music = musicDetailLIZ.music) != null) {
            id = music.getId();
        } else {
            id = 0;
        }
        ((StoryMusicCoverAssem) awS117S0101000_9.l0).LLJLLL.bh(awS117S0101000_9.i1, String.valueOf(id), ((StoryMusicCoverAssem) awS117S0101000_9.l0).yp().getState().LLILLJJLI);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS117S0101000_9 awS117S0101000_9, Object obj) {
        long id;
        Music music;
        MusicDetail musicDetailLIZ = ((C629660Omq) obj).LL.LIZ();
        if (musicDetailLIZ != null && (music = musicDetailLIZ.music) != null) {
            id = music.getId();
        } else {
            id = 0;
        }
        ((StoryMusicIgnoreCopyRightCoverAssem) awS117S0101000_9.l0).LLJJJJJIL.bh(awS117S0101000_9.i1, String.valueOf(id), ((StoryMusicIgnoreCopyRightCoverAssem) awS117S0101000_9.l0).op().getState().LLILLJJLI);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS117S0101000_9 awS117S0101000_9, Object obj) {
        MusicModel musicModelConvertToMusicModel;
        String str;
        Music music;
        C629660Omq c629660Omq = (C629660Omq) obj;
        String str2 = ((MusicItemAssem) awS117S0101000_9.l0).sp().LLILLL;
        if (str2 != null) {
            MusicDetail musicDetailLIZ = c629660Omq.LL.LIZ();
            String musicId = null;
            if (musicDetailLIZ != null && (music = musicDetailLIZ.music) != null) {
                music.setCollectStatus(awS117S0101000_9.i1);
                musicModelConvertToMusicModel = music.convertToMusicModel();
            } else {
                musicModelConvertToMusicModel = null;
            }
            C629770On1 c629770On1 = new C629770On1(musicModelConvertToMusicModel, awS117S0101000_9.i1);
            c629770On1.LIZJ = "music_detail";
            C1440005kM.LIZ(c629770On1);
            C1440005kM.LIZ(new C0OGJ(str2, awS117S0101000_9.i1, false));
            MobClick mobClickObtain = MobClick.obtain();
            if (awS117S0101000_9.i1 == 1) {
                str = "collection_music_cancel";
            } else {
                str = "collection_music";
            }
            mobClickObtain.setEventName(str);
            mobClickObtain.setLabelName("single_song");
            if (musicModelConvertToMusicModel != null) {
                musicId = musicModelConvertToMusicModel.getMusicId();
            }
            mobClickObtain.setValue(String.valueOf(musicId));
            mobClickObtain.setExtValueLong(0L);
            C20684815ws.onEvent(mobClickObtain);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS117S0101000_9 awS117S0101000_9, Object obj) {
        boolean z;
        C20693415yG c20693415yG = (C20693415yG) obj;
        if (awS117S0101000_9.i1 == ((C624650Oel) awS117S0101000_9.l0).LLILZ) {
            z = true;
        } else {
            z = false;
        }
        return C20693415yG.LJJIJL(c20693415yG, z, false, false, false, 8190);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0101000_9(int i, C624650Oel c624650Oel, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c624650Oel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0101000_9(int i, CollectMusicResponse collectMusicResponse, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = collectMusicResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0101000_9(int i, MusicEntranceResult musicEntranceResult, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = musicEntranceResult;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0101000_9(C0OVT c0ovt, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c0ovt;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0101000_9(FollowInnerFeedVM followInnerFeedVM, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = followInnerFeedVM;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0101000_9(StoryMusicCoverAssem storyMusicCoverAssem, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = storyMusicCoverAssem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0101000_9(StoryMusicIgnoreCopyRightCoverAssem storyMusicIgnoreCopyRightCoverAssem, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = storyMusicIgnoreCopyRightCoverAssem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0101000_9(MusicItemAssem musicItemAssem, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = musicItemAssem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0101000_9(TopicReview topicReview, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = topicReview;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS117S0101000_9(List list, List<InterfaceC1891350zJl> list2, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.i1 = list2;
    }
}
