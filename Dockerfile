FROM python  
RUN pip install flask
COPY . /src 
CMD ["python", "/src/index.py"] 