package com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate;

import X.C1697810uHb;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.ad.AwemeRawAdUpdateBugFixParam;
import com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate.AutoDisclaimerUpdateBugFixer;
import com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate.CarouselLabelUpdateBugFixer;
import com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate.PhotoCarouselInfoUpdateBugFixer;
import com.ss.android.ugc.aweme.feed.model.ad.bugfix.awemeupdate.PhotoModeAdShowHitUpdateBugFixer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public interface AwemeRawAdUpdateBugFixer {

    public interface Factory {
        AwemeRawAdUpdateBugFixer create(Aweme aweme, AwemeRawAdUpdateBugFixParam awemeRawAdUpdateBugFixParam);
    }

    void fix(Aweme aweme);

    public static final class BuiltIn {
        public static final Companion Companion = new Companion();
        public static final List<Factory> factories = C1697810uHb.LJIIJJI(new AutoDisclaimerUpdateBugFixer.Factory(), new CarouselLabelUpdateBugFixer.Factory(), new PhotoModeAdShowHitUpdateBugFixer.Factory(), new PhotoCarouselInfoUpdateBugFixer.Factory());

        public static final List<AwemeRawAdUpdateBugFixer> create(Aweme aweme, AwemeRawAdUpdateBugFixParam awemeRawAdUpdateBugFixParam) {
            return Companion.create(aweme, awemeRawAdUpdateBugFixParam);
        }

        public static final class Companion {
            public final List<AwemeRawAdUpdateBugFixer> create(Aweme aweme, AwemeRawAdUpdateBugFixParam awemeRawAdUpdateBugFixParam) {
                if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<Factory> it2 = BuiltIn.factories.iterator();
                    while (it2.hasNext()) {
                        AwemeRawAdUpdateBugFixer awemeRawAdUpdateBugFixerCreate = it2.next().create(aweme, awemeRawAdUpdateBugFixParam);
                        if (awemeRawAdUpdateBugFixerCreate != null) {
                            arrayList.add(awemeRawAdUpdateBugFixerCreate);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return arrayList;
                    }
                }
                return null;
            }
        }
    }
}
