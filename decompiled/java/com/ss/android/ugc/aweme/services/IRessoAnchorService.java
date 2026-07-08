package com.ss.android.ugc.aweme.services;

import android.content.Context;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public interface IRessoAnchorService {
    Pair<Long, Integer> getCopyrightLimitMsUninstalledResso(String str);

    boolean showAnchorUninstalledResso(String str, Context context);
}
