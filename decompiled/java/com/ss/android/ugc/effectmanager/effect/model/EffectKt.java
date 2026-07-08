package com.ss.android.ugc.effectmanager.effect.model;

import X.C13O0;
import X.C20002113Nz;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.ugc.effectplatform.model.DiffEffect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class EffectKt {
    public static final boolean containDiffInfo(Asset asset) {
        boolean z;
        UrlModel diff_url;
        List<String> urlList;
        DiffEffect file_diff;
        UrlModel base_url;
        List<String> urlList2;
        Integer source;
        UrlModel diff_url2;
        String uri;
        UrlModel base_url2;
        String uri2;
        if (C13O0.LIZ && (source = asset.getBusiness_extra().getSource()) != null && source.intValue() == 101 && asset.getBusiness_extra().getFile_diff() != null && (diff_url2 = asset.getBusiness_extra().getFile_diff().getDiff_url()) != null && (uri = diff_url2.getUri()) != null && uri.length() != 0 && (base_url2 = asset.getBusiness_extra().getFile_diff().getBase_url()) != null && (uri2 = base_url2.getUri()) != null && uri2.length() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (C20002113Nz.LIZIZ && z) {
            DiffEffect file_diff2 = asset.getBusiness_extra().getFile_diff();
            if (file_diff2 != null && (diff_url = file_diff2.getDiff_url()) != null && (urlList = diff_url.getUrlList()) != null && !urlList.isEmpty() && (file_diff = asset.getBusiness_extra().getFile_diff()) != null && (base_url = file_diff.getBase_url()) != null && (urlList2 = base_url.getUrlList()) != null && !urlList2.isEmpty()) {
                return true;
            }
            return false;
        }
        return z;
    }

    public static final String expectedMd5(Effect effect) {
        DiffEffect file_diff;
        UrlModel diff_url;
        String uri;
        if (containDiffInfo(effect) && (file_diff = effect.getFile_diff()) != null && (diff_url = file_diff.getDiff_url()) != null && (uri = diff_url.getUri()) != null) {
            return uri;
        }
        if (Intrinsics.LJFF(effect.getFile_url().getUri(), "")) {
            return null;
        }
        return effect.getFile_url().getUri();
    }

    public static final boolean containDiffInfo(Effect effect) {
        boolean z;
        UrlModel diff_url;
        List<String> urlList;
        DiffEffect file_diff;
        UrlModel base_url;
        List<String> urlList2;
        DiffEffect file_diff2;
        UrlModel diff_url2;
        String uri;
        DiffEffect file_diff3;
        UrlModel base_url2;
        String uri2;
        if (C13O0.LIZ && effect.getSource() == 101 && effect.getFile_diff() != null && (file_diff2 = effect.getFile_diff()) != null && (diff_url2 = file_diff2.getDiff_url()) != null && (uri = diff_url2.getUri()) != null && uri.length() != 0 && (file_diff3 = effect.getFile_diff()) != null && (base_url2 = file_diff3.getBase_url()) != null && (uri2 = base_url2.getUri()) != null && uri2.length() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (C20002113Nz.LIZIZ && z) {
            DiffEffect file_diff4 = effect.getFile_diff();
            if (file_diff4 != null && (diff_url = file_diff4.getDiff_url()) != null && (urlList = diff_url.getUrlList()) != null && !urlList.isEmpty() && (file_diff = effect.getFile_diff()) != null && (base_url = file_diff.getBase_url()) != null && (urlList2 = base_url.getUrlList()) != null && !urlList2.isEmpty()) {
                return true;
            }
            return false;
        }
        return z;
    }
}
