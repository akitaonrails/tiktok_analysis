package com.ss.android.ugc.aweme.services;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public interface IEffectCardService {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    void filterEffectCardAweme(List<? extends Aweme> list, Context context);

    Object getEffectRecommendCardViewHolder(View view, Fragment fragment);

    View getEffectRecommendView(Context context);

    boolean shouldInsertEffectRecommendCard(Object obj, Integer num);
}
