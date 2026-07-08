package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.mob;

import X.C20684815ws;
import X.C2097608Jq;
import X.C2344009Gk;
import X.C356901a3;
import X.C444200HbO;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.SearchImageLandingFragment;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.InsiteImageData;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchNimbleImageMob implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final Map<String, String> LL;
    public final Function0<List<ImageData>> LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final Function1<ImageData, Map<String, String>> LLILZ;
    public final Function0<Integer> LLILZIL;
    public Long LLILZLL;
    public Long LLIZ;
    public long LLIZLLLIL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final Map<String, String> LIZ(ImageData imageData) {
        String imageUrl;
        List<ImageData> listInvoke;
        Function1<ImageData, Map<String, String>> function1;
        Map<String, String> mapInvoke;
        List<ImageData> listInvoke2;
        InsiteImageData insiteImageData;
        Aweme aweme;
        Integer numInvoke;
        Pair[] pairArr = new Pair[3];
        String imageSource = null;
        if (imageData != null) {
            imageUrl = imageData.getImageUrl();
        } else {
            imageUrl = null;
        }
        Pair pair = new Pair("image_url", imageUrl);
        int size = 0;
        pairArr[0] = pair;
        if (imageData != null) {
            imageSource = imageData.getImageSource();
        }
        pairArr[1] = new Pair("image_source", imageSource);
        Function0<Integer> function0 = this.LLILZIL;
        if (function0 != null && (numInvoke = function0.invoke()) != null && numInvoke.intValue() > 0) {
            size = numInvoke.intValue();
        } else {
            Function0<List<ImageData>> function02 = this.LLILLJJLI;
            if (function02 != null && (listInvoke = function02.invoke()) != null) {
                size = listInvoke.size();
            }
        }
        pairArr[2] = new Pair("pic_cnt", String.valueOf(size));
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (imageData != null && (insiteImageData = imageData.insiteImage) != null && (aweme = insiteImageData.awemeData) != null) {
            mapLJIIJ.put("author_id", AwemeExtKt.getAuthorUid(aweme));
        }
        Function0<List<ImageData>> function03 = this.LLILLJJLI;
        if (function03 != null && (listInvoke2 = function03.invoke()) != null) {
            mapLJIIJ.put("item_rank", String.valueOf(listInvoke2.indexOf(imageData)));
        }
        if (imageData != null && (function1 = this.LLILZ) != null && (mapInvoke = function1.invoke(imageData)) != null) {
            mapLJIIJ.putAll(mapInvoke);
        }
        return mapLJIIJ;
    }

    public final void LIZIZ(ImageData imageData) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(this.LL);
        c2344009Gk.LJII(LIZ(imageData));
        C20684815ws.LJIILLIIL("feed_enter", c2344009Gk.LIZ);
    }

    public final void LIZLLL(int i) {
        List<ImageData> listInvoke;
        long jCurrentTimeMillis;
        Function0<List<ImageData>> function0 = this.LLILLJJLI;
        if (function0 != null) {
            listInvoke = function0.invoke();
        } else {
            listInvoke = null;
        }
        ImageData imageData = (ImageData) C444200HbO.LIZ(i, listInvoke);
        Long l = this.LLILZLL;
        if (l != null) {
            jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        } else {
            jCurrentTimeMillis = 0;
        }
        this.LLILZLL = Long.valueOf(System.currentTimeMillis());
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(this.LL);
        c2344009Gk.LJII(LIZ(imageData));
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("play_time", c2344009Gk.LIZ);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.LLILZLL = Long.valueOf(System.currentTimeMillis());
        this.LLIZ = Long.valueOf(System.currentTimeMillis());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        Long l = this.LLIZ;
        if (l != null) {
            this.LLIZLLLIL += System.currentTimeMillis() - l.longValue();
        }
        this.LLIZ = null;
    }

    public final void LIZJ(int i, int i2) {
        List<ImageData> listInvoke;
        String str;
        Function0<List<ImageData>> function0 = this.LLILLJJLI;
        if (function0 != null) {
            listInvoke = function0.invoke();
        } else {
            listInvoke = null;
        }
        ImageData imageData = (ImageData) C444200HbO.LIZ(i2, listInvoke);
        if (i == -1) {
            str = "2";
        } else if (i > i2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(this.LL);
        c2344009Gk.LJII(LIZ(imageData));
        c2344009Gk.LJIIIIZZ("slide_direction", str);
        C20684815ws.LJIILLIIL("multi_photo_slide", c2344009Gk.LIZ);
    }

    public final void LJ(String str, ImageData imageData) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(this.LL);
        c2344009Gk.LJII(LIZ(imageData));
        c2344009Gk.LJIIIIZZ("button_type", str);
        C20684815ws.LJIILLIIL("search_result_click", c2344009Gk.LIZ);
    }

    public SearchNimbleImageMob(Map map, AwS554S0100000_10 awS554S0100000_10, SearchImageLandingFragment searchImageLandingFragment, Function1 function1, AwS554S0100000_10 awS554S0100000_102) {
        this.LL = map;
        this.LLILLJJLI = awS554S0100000_10;
        this.LLILLL = searchImageLandingFragment;
        this.LLILZ = function1;
        this.LLILZIL = awS554S0100000_102;
        searchImageLandingFragment.getLifecycle().addObserver(this);
    }
}
