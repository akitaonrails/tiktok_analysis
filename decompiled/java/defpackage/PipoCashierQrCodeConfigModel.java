package defpackage;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoCashierQrCodeConfigModel implements Serializable {

    @C09CT("contact_cs_error_code")
    public final List<String> contactCsErrorCode;

    @C09CT("debounce_interval")
    public final Float debounceInterval;

    @C09CT("download_image_config")
    public final DownloadImageConfig downloadImageConfig;

    @C09CT("pipo_error_code_enabled")
    public final Integer isErrorCodeEnabled;

    @C09CT("logo_layout_params")
    public final LogoLayoutParamsModel logoLayoutParams;

    @C09CT("max_digit_count")
    public final Integer maxDigitCount;

    @C09CT("polling_interval")
    public final Integer pollingInterval;

    @C09CT("preload_urls")
    public final List<String> preloadImageUrls;

    public PipoCashierQrCodeConfigModel() {
        this(null, null, null, null, null, null, null, null);
    }

    public final Integer isErrorCodeEnabled() {
        return this.isErrorCodeEnabled;
    }

    public PipoCashierQrCodeConfigModel(Integer num, Integer num2, Integer num3, Float f, List<String> list, List<String> list2, LogoLayoutParamsModel logoLayoutParamsModel, DownloadImageConfig downloadImageConfig) {
        this.isErrorCodeEnabled = num;
        this.pollingInterval = num2;
        this.maxDigitCount = num3;
        this.debounceInterval = f;
        this.contactCsErrorCode = list;
        this.preloadImageUrls = list2;
        this.logoLayoutParams = logoLayoutParamsModel;
        this.downloadImageConfig = downloadImageConfig;
    }
}
