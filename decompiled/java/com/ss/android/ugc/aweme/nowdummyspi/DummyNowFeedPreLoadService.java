package com.ss.android.ugc.aweme.nowdummyspi;

import X.C786410Ut5;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.service.INowFeedPreLoadService;

/* JADX INFO: loaded from: classes22.dex */
public final class DummyNowFeedPreLoadService implements INowFeedPreLoadService {
    @Override // com.ss.android.ugc.aweme.service.INowFeedPreLoadService
    public final View LIZ(int i, Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (layoutInflater == null) {
            layoutInflater = C786410Ut5.ne(context);
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }
}
