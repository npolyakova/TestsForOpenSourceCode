import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import teammates.common.datatransfer.questions.FeedbackResponseDetails;
import teammates.common.datatransfer.questions.FeedbackTextResponseDetails;
import teammates.ui.request.FeedbackResponsesRequest;
import teammates.ui.request.InvalidHttpRequestBodyException;

public class WTest {

    @Test
    public void firstTestEx() {
        FeedbackResponseDetails b = new FeedbackTextResponseDetails();
        FeedbackResponsesRequest.FeedbackResponseRequest a = new FeedbackResponsesRequest.FeedbackResponseRequest(
                "123",
                b
        );

        Assertions.assertDoesNotThrow(a::validate);
    }

    @Test
    public void secondTestEx() {
        FeedbackResponseDetails b = new FeedbackTextResponseDetails();
        FeedbackResponsesRequest.FeedbackResponseRequest a = new FeedbackResponsesRequest.FeedbackResponseRequest(
                null,
                null
        );

        Assertions.assertThrows(InvalidHttpRequestBodyException.class, a::validate);
    }
}
