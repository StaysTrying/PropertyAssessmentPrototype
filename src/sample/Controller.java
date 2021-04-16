package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private Tab TbReceiving;

    @FXML
    private ImageView LCPAlogo1;

    @FXML
    private ScrollPane receivingScroll;

    @FXML
    private TableView<?> TblReceiving;

    @FXML
    private TableColumn<?, ?> RTCfolioID;

    @FXML
    private TableColumn<?, ?> RTCstrap;

    @FXML
    private TableColumn<?, ?> RTCparcel;

    @FXML
    private TableColumn<?, ?> RTCname;

    @FXML
    private TableColumn<?, ?> RTCothers;

    @FXML
    private TableColumn<?, ?> RTCaddress1;

    @FXML
    private TableColumn<?, ?> RTCaddress2;

    @FXML
    private TableColumn<?, ?> RTCcity;

    @FXML
    private TableColumn<?, ?> RTCstate;

    @FXML
    private TableColumn<?, ?> RTCzip;

    @FXML
    private TableColumn<?, ?> RTCcountry;

    @FXML
    private TableColumn<?, ?> RTCinstrument;

    @FXML
    private TableColumn<?, ?> RTCvacImp;

    @FXML
    private TableColumn<?, ?> RTCamount;

    @FXML
    private TableColumn<?, ?> RTCkeyNumber;

    @FXML
    private TableColumn<?, ?> RTCdos;

    @FXML
    private TableColumn<?, ?> RTCsiteNum;

    @FXML
    private TableColumn<?, ?> RTCsiteStreet;

    @FXML
    private TableColumn<?, ?> RTCsiteCity;

    @FXML
    private TableColumn<?, ?> RTCsiteZip;

    @FXML
    private TableColumn<?, ?> RTClegal;

    @FXML
    private TableColumn<?, ?> RTCtype;

    @FXML
    private TableColumn<?, ?> RTCmultiMessage;

    @FXML
    private ChoiceBox<?> recDate;

    @FXML
    private Label LblSelectDate;

    @FXML
    private Button BtnProcess;

    @FXML
    private Tab TbProcessing;

    @FXML
    private ProgressBar ProgAssessment;

    @FXML
    private TextField TxtDate;

    @FXML
    private Label LblSelectedDate;

    @FXML
    private Label TxtStatus;

    @FXML
    private ImageView LCPAlogo2;

    @FXML
    private Tab TbReview;

    @FXML
    private ScrollPane reviewScroll;

    @FXML
    private TableView<?> TblReview;

    @FXML
    private TableColumn<?, ?> RevFolioID;

    @FXML
    private TableColumn<?, ?> RevStrap;

    @FXML
    private TableColumn<?, ?> RevParcel;

    @FXML
    private TableColumn<?, ?> RevName;

    @FXML
    private TableColumn<?, ?> RevPropCode;

    @FXML
    private TableColumn<?, ?> RevAddress;

    @FXML
    private TableColumn<?, ?> RevAddress2;

    @FXML
    private TableColumn<?, ?> RevCity;

    @FXML
    private TableColumn<?, ?> RevState;

    @FXML
    private TableColumn<?, ?> RevZip;

    @FXML
    private TableColumn<?, ?> RevCountry;

    @FXML
    private TableColumn<?, ?> RevInstrument;

    @FXML
    private TableColumn<?, ?> RevVacImap;

    @FXML
    private TableColumn<?, ?> RevAmount;

    @FXML
    private TableColumn<?, ?> RevKeyNumber;

    @FXML
    private TableColumn<?, ?> RevDOS;

    @FXML
    private Label LblReviewDate;

    @FXML
    private ChoiceBox<?> revDate;

    @FXML
    private ImageView LCPAlogo3;

}
